/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class MyClass_record extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3139488748689346182L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MyClass_record\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"fields\",\"type\":{\"type\":\"record\",\"name\":\"fields\",\"fields\":[{\"name\":\"key_field1\",\"type\":\"string\"},{\"name\":\"timestamp_field1\",\"type\":\"string\"},{\"name\":\"string_field1\",\"type\":\"string\"},{\"name\":\"double_field1\",\"type\":\"string\"}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<MyClass_record> ENCODER =
      new BinaryMessageEncoder<MyClass_record>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MyClass_record> DECODER =
      new BinaryMessageDecoder<MyClass_record>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<MyClass_record> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<MyClass_record> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<MyClass_record> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<MyClass_record>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this MyClass_record to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a MyClass_record from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a MyClass_record instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static MyClass_record fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence name;
  private fields fields;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MyClass_record() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param fields The new value for fields
   */
  public MyClass_record(java.lang.CharSequence name, fields fields) {
    this.name = name;
    this.fields = fields;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return fields;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: fields = (fields)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'fields' field.
   * @return The value of the 'fields' field.
   */
  public fields getFields() {
    return fields;
  }


  /**
   * Sets the value of the 'fields' field.
   * @param value the value to set.
   */
  public void setFields(fields value) {
    this.fields = value;
  }

  /**
   * Creates a new MyClass_record RecordBuilder.
   * @return A new MyClass_record RecordBuilder
   */
  public static MyClass_record.Builder newBuilder() {
    return new MyClass_record.Builder();
  }

  /**
   * Creates a new MyClass_record RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MyClass_record RecordBuilder
   */
  public static MyClass_record.Builder newBuilder(MyClass_record.Builder other) {
    if (other == null) {
      return new MyClass_record.Builder();
    } else {
      return new MyClass_record.Builder(other);
    }
  }

  /**
   * Creates a new MyClass_record RecordBuilder by copying an existing MyClass_record instance.
   * @param other The existing instance to copy.
   * @return A new MyClass_record RecordBuilder
   */
  public static MyClass_record.Builder newBuilder(MyClass_record other) {
    if (other == null) {
      return new MyClass_record.Builder();
    } else {
      return new MyClass_record.Builder(other);
    }
  }

  /**
   * RecordBuilder for MyClass_record instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MyClass_record>
    implements org.apache.avro.data.RecordBuilder<MyClass_record> {

    private java.lang.CharSequence name;
    private fields fields;
    private fields.Builder fieldsBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(MyClass_record.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.fields)) {
        this.fields = data().deepCopy(fields()[1].schema(), other.fields);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasFieldsBuilder()) {
        this.fieldsBuilder = fields.newBuilder(other.getFieldsBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing MyClass_record instance
     * @param other The existing instance to copy.
     */
    private Builder(MyClass_record other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.fields)) {
        this.fields = data().deepCopy(fields()[1].schema(), other.fields);
        fieldSetFlags()[1] = true;
      }
      this.fieldsBuilder = null;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public MyClass_record.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public MyClass_record.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'fields' field.
      * @return The value.
      */
    public fields getFields() {
      return fields;
    }


    /**
      * Sets the value of the 'fields' field.
      * @param value The value of 'fields'.
      * @return This builder.
      */
    public MyClass_record.Builder setFields(fields value) {
      validate(fields()[1], value);
      this.fieldsBuilder = null;
      this.fields = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'fields' field has been set.
      * @return True if the 'fields' field has been set, false otherwise.
      */
    public boolean hasFields() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'fields' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public fields.Builder getFieldsBuilder() {
      if (fieldsBuilder == null) {
        if (hasFields()) {
          setFieldsBuilder(fields.newBuilder(fields));
        } else {
          setFieldsBuilder(fields.newBuilder());
        }
      }
      return fieldsBuilder;
    }

    /**
     * Sets the Builder instance for the 'fields' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public MyClass_record.Builder setFieldsBuilder(fields.Builder value) {
      clearFields();
      fieldsBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'fields' field has an active Builder instance
     * @return True if the 'fields' field has an active Builder instance
     */
    public boolean hasFieldsBuilder() {
      return fieldsBuilder != null;
    }

    /**
      * Clears the value of the 'fields' field.
      * @return This builder.
      */
    public MyClass_record.Builder clearFields() {
      fields = null;
      fieldsBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MyClass_record build() {
      try {
        MyClass_record record = new MyClass_record();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        if (fieldsBuilder != null) {
          try {
            record.fields = this.fieldsBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("fields"));
            throw e;
          }
        } else {
          record.fields = fieldSetFlags()[1] ? this.fields : (fields) defaultValue(fields()[1]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MyClass_record>
    WRITER$ = (org.apache.avro.io.DatumWriter<MyClass_record>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MyClass_record>
    READER$ = (org.apache.avro.io.DatumReader<MyClass_record>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.name);

    this.fields.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

      if (this.fields == null) {
        this.fields = new fields();
      }
      this.fields.customDecode(in);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          break;

        case 1:
          if (this.fields == null) {
            this.fields = new fields();
          }
          this.fields.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









