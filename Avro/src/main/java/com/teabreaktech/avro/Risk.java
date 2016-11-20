/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.teabreaktech.avro;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Risk extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1365708054974336978L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Risk\",\"namespace\":\"com.teabreaktech.avro\",\"fields\":[{\"name\":\"intType\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"longType\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"doubleType\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"stringType\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Integer intType;
  @Deprecated public java.lang.Long longType;
  @Deprecated public java.lang.Double doubleType;
  @Deprecated public java.lang.CharSequence stringType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Risk() {}

  /**
   * All-args constructor.
   * @param intType The new value for intType
   * @param longType The new value for longType
   * @param doubleType The new value for doubleType
   * @param stringType The new value for stringType
   */
  public Risk(java.lang.Integer intType, java.lang.Long longType, java.lang.Double doubleType, java.lang.CharSequence stringType) {
    this.intType = intType;
    this.longType = longType;
    this.doubleType = doubleType;
    this.stringType = stringType;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return intType;
    case 1: return longType;
    case 2: return doubleType;
    case 3: return stringType;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: intType = (java.lang.Integer)value$; break;
    case 1: longType = (java.lang.Long)value$; break;
    case 2: doubleType = (java.lang.Double)value$; break;
    case 3: stringType = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'intType' field.
   * @return The value of the 'intType' field.
   */
  public java.lang.Integer getIntType() {
    return intType;
  }

  /**
   * Sets the value of the 'intType' field.
   * @param value the value to set.
   */
  public void setIntType(java.lang.Integer value) {
    this.intType = value;
  }

  /**
   * Gets the value of the 'longType' field.
   * @return The value of the 'longType' field.
   */
  public java.lang.Long getLongType() {
    return longType;
  }

  /**
   * Sets the value of the 'longType' field.
   * @param value the value to set.
   */
  public void setLongType(java.lang.Long value) {
    this.longType = value;
  }

  /**
   * Gets the value of the 'doubleType' field.
   * @return The value of the 'doubleType' field.
   */
  public java.lang.Double getDoubleType() {
    return doubleType;
  }

  /**
   * Sets the value of the 'doubleType' field.
   * @param value the value to set.
   */
  public void setDoubleType(java.lang.Double value) {
    this.doubleType = value;
  }

  /**
   * Gets the value of the 'stringType' field.
   * @return The value of the 'stringType' field.
   */
  public java.lang.CharSequence getStringType() {
    return stringType;
  }

  /**
   * Sets the value of the 'stringType' field.
   * @param value the value to set.
   */
  public void setStringType(java.lang.CharSequence value) {
    this.stringType = value;
  }

  /**
   * Creates a new Risk RecordBuilder.
   * @return A new Risk RecordBuilder
   */
  public static com.teabreaktech.avro.Risk.Builder newBuilder() {
    return new com.teabreaktech.avro.Risk.Builder();
  }

  /**
   * Creates a new Risk RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Risk RecordBuilder
   */
  public static com.teabreaktech.avro.Risk.Builder newBuilder(com.teabreaktech.avro.Risk.Builder other) {
    return new com.teabreaktech.avro.Risk.Builder(other);
  }

  /**
   * Creates a new Risk RecordBuilder by copying an existing Risk instance.
   * @param other The existing instance to copy.
   * @return A new Risk RecordBuilder
   */
  public static com.teabreaktech.avro.Risk.Builder newBuilder(com.teabreaktech.avro.Risk other) {
    return new com.teabreaktech.avro.Risk.Builder(other);
  }

  /**
   * RecordBuilder for Risk instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Risk>
    implements org.apache.avro.data.RecordBuilder<Risk> {

    private java.lang.Integer intType;
    private java.lang.Long longType;
    private java.lang.Double doubleType;
    private java.lang.CharSequence stringType;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.teabreaktech.avro.Risk.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.intType)) {
        this.intType = data().deepCopy(fields()[0].schema(), other.intType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.longType)) {
        this.longType = data().deepCopy(fields()[1].schema(), other.longType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.doubleType)) {
        this.doubleType = data().deepCopy(fields()[2].schema(), other.doubleType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.stringType)) {
        this.stringType = data().deepCopy(fields()[3].schema(), other.stringType);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Risk instance
     * @param other The existing instance to copy.
     */
    private Builder(com.teabreaktech.avro.Risk other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.intType)) {
        this.intType = data().deepCopy(fields()[0].schema(), other.intType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.longType)) {
        this.longType = data().deepCopy(fields()[1].schema(), other.longType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.doubleType)) {
        this.doubleType = data().deepCopy(fields()[2].schema(), other.doubleType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.stringType)) {
        this.stringType = data().deepCopy(fields()[3].schema(), other.stringType);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'intType' field.
      * @return The value.
      */
    public java.lang.Integer getIntType() {
      return intType;
    }

    /**
      * Sets the value of the 'intType' field.
      * @param value The value of 'intType'.
      * @return This builder.
      */
    public com.teabreaktech.avro.Risk.Builder setIntType(java.lang.Integer value) {
      validate(fields()[0], value);
      this.intType = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'intType' field has been set.
      * @return True if the 'intType' field has been set, false otherwise.
      */
    public boolean hasIntType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'intType' field.
      * @return This builder.
      */
    public com.teabreaktech.avro.Risk.Builder clearIntType() {
      intType = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'longType' field.
      * @return The value.
      */
    public java.lang.Long getLongType() {
      return longType;
    }

    /**
      * Sets the value of the 'longType' field.
      * @param value The value of 'longType'.
      * @return This builder.
      */
    public com.teabreaktech.avro.Risk.Builder setLongType(java.lang.Long value) {
      validate(fields()[1], value);
      this.longType = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'longType' field has been set.
      * @return True if the 'longType' field has been set, false otherwise.
      */
    public boolean hasLongType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'longType' field.
      * @return This builder.
      */
    public com.teabreaktech.avro.Risk.Builder clearLongType() {
      longType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'doubleType' field.
      * @return The value.
      */
    public java.lang.Double getDoubleType() {
      return doubleType;
    }

    /**
      * Sets the value of the 'doubleType' field.
      * @param value The value of 'doubleType'.
      * @return This builder.
      */
    public com.teabreaktech.avro.Risk.Builder setDoubleType(java.lang.Double value) {
      validate(fields()[2], value);
      this.doubleType = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'doubleType' field has been set.
      * @return True if the 'doubleType' field has been set, false otherwise.
      */
    public boolean hasDoubleType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'doubleType' field.
      * @return This builder.
      */
    public com.teabreaktech.avro.Risk.Builder clearDoubleType() {
      doubleType = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'stringType' field.
      * @return The value.
      */
    public java.lang.CharSequence getStringType() {
      return stringType;
    }

    /**
      * Sets the value of the 'stringType' field.
      * @param value The value of 'stringType'.
      * @return This builder.
      */
    public com.teabreaktech.avro.Risk.Builder setStringType(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.stringType = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'stringType' field has been set.
      * @return True if the 'stringType' field has been set, false otherwise.
      */
    public boolean hasStringType() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'stringType' field.
      * @return This builder.
      */
    public com.teabreaktech.avro.Risk.Builder clearStringType() {
      stringType = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Risk build() {
      try {
        Risk record = new Risk();
        record.intType = fieldSetFlags()[0] ? this.intType : (java.lang.Integer) defaultValue(fields()[0]);
        record.longType = fieldSetFlags()[1] ? this.longType : (java.lang.Long) defaultValue(fields()[1]);
        record.doubleType = fieldSetFlags()[2] ? this.doubleType : (java.lang.Double) defaultValue(fields()[2]);
        record.stringType = fieldSetFlags()[3] ? this.stringType : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}