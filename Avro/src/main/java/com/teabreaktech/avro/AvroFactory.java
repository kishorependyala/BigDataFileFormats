package com.teabreaktech.avro;

import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;

import java.util.concurrent.ConcurrentHashMap;


public class AvroFactory {

    private static final AvroFactory instance = new AvroFactory();
    private ConcurrentHashMap<Class<?>, Schema> registry = new ConcurrentHashMap<Class<?>, Schema>();

    private AvroFactory() {
        register(Risk.class, getRiskSchema());
        register(Wrapper.class, getWrapperSchema(getSchema(Risk.class)));
    }

    public static AvroFactory get() {
        return instance;
    }

    private static Schema getRiskSchema() {
        return SchemaBuilder.record("Risk").namespace("com.teabreaktechnology.avro").fields()
                .name("intType").type().optional().intType()
                .name("longType").type().optional().longType()
                .name("doubleType").type().optional().doubleType()
                .name("stringType").type().optional().stringType()
                .endRecord();

    }

    private static Schema getWrapperSchema(Schema riskSchema) {
        return SchemaBuilder.record("Wrapper").namespace("com.teabreaktechnology.avro").fields()
                .name("intType").type().intType().noDefault()
                .name("longType").type().longType().noDefault()
                .name("doubleType").type().doubleType().noDefault()
                .name("risk").type().unionOf().nullType().and().type(riskSchema).endUnion().nullDefault()
                .name("arrayType").type().array().items().intType().noDefault()
                .endRecord();

    }

    public Schema getSchema(Class<?> clazz) {
        return registry.get(clazz);
    }

    private void register(Class<?> userClass, Schema schema) {
        Schema existing = registry.putIfAbsent(userClass, schema);
        if (existing != null) {
            throw new RuntimeException("Class " + userClass + " already registered");
        }
    }
}
