// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/reads.proto

package com.google.genomics.v1;

/**
 * Protobuf type {@code google.genomics.v1.ImportReadGroupSetsRequest}
 *
 * <pre>
 * The read group set import request.
 * </pre>
 */
public  final class ImportReadGroupSetsRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.ImportReadGroupSetsRequest)
    ImportReadGroupSetsRequestOrBuilder {
  // Use ImportReadGroupSetsRequest.newBuilder() to construct.
  private ImportReadGroupSetsRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ImportReadGroupSetsRequest() {
    datasetId_ = "";
    referenceSetId_ = "";
    sourceUris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    partitionStrategy_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ImportReadGroupSetsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();

            datasetId_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              sourceUris_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            sourceUris_.add(s);
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            referenceSetId_ = s;
            break;
          }
          case 40: {
            int rawValue = input.readEnum();

            partitionStrategy_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        sourceUris_ = sourceUris_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_ImportReadGroupSetsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_ImportReadGroupSetsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.ImportReadGroupSetsRequest.class, com.google.genomics.v1.ImportReadGroupSetsRequest.Builder.class);
  }

  /**
   * Protobuf enum {@code google.genomics.v1.ImportReadGroupSetsRequest.PartitionStrategy}
   */
  public enum PartitionStrategy
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PARTITION_STRATEGY_UNSPECIFIED = 0;</code>
     */
    PARTITION_STRATEGY_UNSPECIFIED(0, 0),
    /**
     * <code>PER_FILE_PER_SAMPLE = 1;</code>
     *
     * <pre>
     * In most cases, this strategy yields one read group set per file. This is
     * the default behavior.
     * Allocate one read group set per file per sample. For BAM files, read
     * groups are considered to share a sample if they have identical sample
     * names. Furthermore, all reads for each file which do not belong to a read
     * group, if any, will be grouped into a single read group set per-file.
     * </pre>
     */
    PER_FILE_PER_SAMPLE(1, 1),
    /**
     * <code>MERGE_ALL = 2;</code>
     *
     * <pre>
     * Includes all read groups in all imported files into a single read group
     * set. Requires that the headers for all imported files are equivalent. All
     * reads which do not belong to a read group, if any, will be grouped into a
     * separate read group set.
     * </pre>
     */
    MERGE_ALL(2, 2),
    UNRECOGNIZED(-1, -1),
    ;

    /**
     * <code>PARTITION_STRATEGY_UNSPECIFIED = 0;</code>
     */
    public static final int PARTITION_STRATEGY_UNSPECIFIED_VALUE = 0;
    /**
     * <code>PER_FILE_PER_SAMPLE = 1;</code>
     *
     * <pre>
     * In most cases, this strategy yields one read group set per file. This is
     * the default behavior.
     * Allocate one read group set per file per sample. For BAM files, read
     * groups are considered to share a sample if they have identical sample
     * names. Furthermore, all reads for each file which do not belong to a read
     * group, if any, will be grouped into a single read group set per-file.
     * </pre>
     */
    public static final int PER_FILE_PER_SAMPLE_VALUE = 1;
    /**
     * <code>MERGE_ALL = 2;</code>
     *
     * <pre>
     * Includes all read groups in all imported files into a single read group
     * set. Requires that the headers for all imported files are equivalent. All
     * reads which do not belong to a read group, if any, will be grouped into a
     * separate read group set.
     * </pre>
     */
    public static final int MERGE_ALL_VALUE = 2;


    public final int getNumber() {
      if (index == -1) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    public static PartitionStrategy valueOf(int value) {
      switch (value) {
        case 0: return PARTITION_STRATEGY_UNSPECIFIED;
        case 1: return PER_FILE_PER_SAMPLE;
        case 2: return MERGE_ALL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PartitionStrategy>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PartitionStrategy> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PartitionStrategy>() {
            public PartitionStrategy findValueByNumber(int number) {
              return PartitionStrategy.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.genomics.v1.ImportReadGroupSetsRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final PartitionStrategy[] VALUES = values();

    public static PartitionStrategy valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private PartitionStrategy(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.genomics.v1.ImportReadGroupSetsRequest.PartitionStrategy)
  }

  private int bitField0_;
  public static final int DATASET_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object datasetId_;
  /**
   * <code>optional string dataset_id = 1;</code>
   *
   * <pre>
   * Required. The ID of the dataset these read group sets will belong to. The
   * caller must have WRITE permissions to this dataset.
   * </pre>
   */
  public java.lang.String getDatasetId() {
    java.lang.Object ref = datasetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      datasetId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string dataset_id = 1;</code>
   *
   * <pre>
   * Required. The ID of the dataset these read group sets will belong to. The
   * caller must have WRITE permissions to this dataset.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getDatasetIdBytes() {
    java.lang.Object ref = datasetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      datasetId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REFERENCE_SET_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object referenceSetId_;
  /**
   * <code>optional string reference_set_id = 4;</code>
   *
   * <pre>
   * The reference set to which the imported read group sets are aligned to, if
   * any. The reference names of this reference set must be a superset of those
   * found in the imported file headers. If no reference set id is provided, a
   * best effort is made to associate with a matching reference set.
   * </pre>
   */
  public java.lang.String getReferenceSetId() {
    java.lang.Object ref = referenceSetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      referenceSetId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string reference_set_id = 4;</code>
   *
   * <pre>
   * The reference set to which the imported read group sets are aligned to, if
   * any. The reference names of this reference set must be a superset of those
   * found in the imported file headers. If no reference set id is provided, a
   * best effort is made to associate with a matching reference set.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getReferenceSetIdBytes() {
    java.lang.Object ref = referenceSetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      referenceSetId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_URIS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList sourceUris_;
  /**
   * <code>repeated string source_uris = 2;</code>
   *
   * <pre>
   * A list of URIs pointing at BAM files in Google Cloud Storage.
   * </pre>
   */
  public com.google.protobuf.ProtocolStringList
      getSourceUrisList() {
    return sourceUris_;
  }
  /**
   * <code>repeated string source_uris = 2;</code>
   *
   * <pre>
   * A list of URIs pointing at BAM files in Google Cloud Storage.
   * </pre>
   */
  public int getSourceUrisCount() {
    return sourceUris_.size();
  }
  /**
   * <code>repeated string source_uris = 2;</code>
   *
   * <pre>
   * A list of URIs pointing at BAM files in Google Cloud Storage.
   * </pre>
   */
  public java.lang.String getSourceUris(int index) {
    return sourceUris_.get(index);
  }
  /**
   * <code>repeated string source_uris = 2;</code>
   *
   * <pre>
   * A list of URIs pointing at BAM files in Google Cloud Storage.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getSourceUrisBytes(int index) {
    return sourceUris_.getByteString(index);
  }

  public static final int PARTITION_STRATEGY_FIELD_NUMBER = 5;
  private int partitionStrategy_;
  /**
   * <code>optional .google.genomics.v1.ImportReadGroupSetsRequest.PartitionStrategy partition_strategy = 5;</code>
   *
   * <pre>
   * The partition strategy describes how read groups are partitioned into read
   * group sets.
   * </pre>
   */
  public int getPartitionStrategyValue() {
    return partitionStrategy_;
  }
  /**
   * <code>optional .google.genomics.v1.ImportReadGroupSetsRequest.PartitionStrategy partition_strategy = 5;</code>
   *
   * <pre>
   * The partition strategy describes how read groups are partitioned into read
   * group sets.
   * </pre>
   */
  public com.google.genomics.v1.ImportReadGroupSetsRequest.PartitionStrategy getPartitionStrategy() {
    com.google.genomics.v1.ImportReadGroupSetsRequest.PartitionStrategy result = com.google.genomics.v1.ImportReadGroupSetsRequest.PartitionStrategy.valueOf(partitionStrategy_);
    return result == null ? com.google.genomics.v1.ImportReadGroupSetsRequest.PartitionStrategy.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getDatasetIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, datasetId_);
    }
    for (int i = 0; i < sourceUris_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, sourceUris_.getRaw(i));
    }
    if (!getReferenceSetIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, referenceSetId_);
    }
    if (partitionStrategy_ != com.google.genomics.v1.ImportReadGroupSetsRequest.PartitionStrategy.PARTITION_STRATEGY_UNSPECIFIED.getNumber()) {
      output.writeEnum(5, partitionStrategy_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDatasetIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, datasetId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < sourceUris_.size(); i++) {
        dataSize += computeStringSizeNoTag(sourceUris_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSourceUrisList().size();
    }
    if (!getReferenceSetIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, referenceSetId_);
    }
    if (partitionStrategy_ != com.google.genomics.v1.ImportReadGroupSetsRequest.PartitionStrategy.PARTITION_STRATEGY_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, partitionStrategy_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.genomics.v1.ImportReadGroupSetsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.ImportReadGroupSetsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.ImportReadGroupSetsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.ImportReadGroupSetsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.ImportReadGroupSetsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.ImportReadGroupSetsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.ImportReadGroupSetsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.genomics.v1.ImportReadGroupSetsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.ImportReadGroupSetsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.ImportReadGroupSetsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.genomics.v1.ImportReadGroupSetsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.genomics.v1.ImportReadGroupSetsRequest}
   *
   * <pre>
   * The read group set import request.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.ImportReadGroupSetsRequest)
      com.google.genomics.v1.ImportReadGroupSetsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_ImportReadGroupSetsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_ImportReadGroupSetsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.ImportReadGroupSetsRequest.class, com.google.genomics.v1.ImportReadGroupSetsRequest.Builder.class);
    }

    // Construct using com.google.genomics.v1.ImportReadGroupSetsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      datasetId_ = "";

      referenceSetId_ = "";

      sourceUris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      partitionStrategy_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_ImportReadGroupSetsRequest_descriptor;
    }

    public com.google.genomics.v1.ImportReadGroupSetsRequest getDefaultInstanceForType() {
      return com.google.genomics.v1.ImportReadGroupSetsRequest.getDefaultInstance();
    }

    public com.google.genomics.v1.ImportReadGroupSetsRequest build() {
      com.google.genomics.v1.ImportReadGroupSetsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1.ImportReadGroupSetsRequest buildPartial() {
      com.google.genomics.v1.ImportReadGroupSetsRequest result = new com.google.genomics.v1.ImportReadGroupSetsRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.datasetId_ = datasetId_;
      result.referenceSetId_ = referenceSetId_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        sourceUris_ = sourceUris_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.sourceUris_ = sourceUris_;
      result.partitionStrategy_ = partitionStrategy_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.genomics.v1.ImportReadGroupSetsRequest) {
        return mergeFrom((com.google.genomics.v1.ImportReadGroupSetsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.ImportReadGroupSetsRequest other) {
      if (other == com.google.genomics.v1.ImportReadGroupSetsRequest.getDefaultInstance()) return this;
      if (!other.getDatasetId().isEmpty()) {
        datasetId_ = other.datasetId_;
        onChanged();
      }
      if (!other.getReferenceSetId().isEmpty()) {
        referenceSetId_ = other.referenceSetId_;
        onChanged();
      }
      if (!other.sourceUris_.isEmpty()) {
        if (sourceUris_.isEmpty()) {
          sourceUris_ = other.sourceUris_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureSourceUrisIsMutable();
          sourceUris_.addAll(other.sourceUris_);
        }
        onChanged();
      }
      if (other.partitionStrategy_ != 0) {
        setPartitionStrategyValue(other.getPartitionStrategyValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.genomics.v1.ImportReadGroupSetsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1.ImportReadGroupSetsRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object datasetId_ = "";
    /**
     * <code>optional string dataset_id = 1;</code>
     *
     * <pre>
     * Required. The ID of the dataset these read group sets will belong to. The
     * caller must have WRITE permissions to this dataset.
     * </pre>
     */
    public java.lang.String getDatasetId() {
      java.lang.Object ref = datasetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        datasetId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string dataset_id = 1;</code>
     *
     * <pre>
     * Required. The ID of the dataset these read group sets will belong to. The
     * caller must have WRITE permissions to this dataset.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getDatasetIdBytes() {
      java.lang.Object ref = datasetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        datasetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string dataset_id = 1;</code>
     *
     * <pre>
     * Required. The ID of the dataset these read group sets will belong to. The
     * caller must have WRITE permissions to this dataset.
     * </pre>
     */
    public Builder setDatasetId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      datasetId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string dataset_id = 1;</code>
     *
     * <pre>
     * Required. The ID of the dataset these read group sets will belong to. The
     * caller must have WRITE permissions to this dataset.
     * </pre>
     */
    public Builder clearDatasetId() {
      
      datasetId_ = getDefaultInstance().getDatasetId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string dataset_id = 1;</code>
     *
     * <pre>
     * Required. The ID of the dataset these read group sets will belong to. The
     * caller must have WRITE permissions to this dataset.
     * </pre>
     */
    public Builder setDatasetIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      datasetId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object referenceSetId_ = "";
    /**
     * <code>optional string reference_set_id = 4;</code>
     *
     * <pre>
     * The reference set to which the imported read group sets are aligned to, if
     * any. The reference names of this reference set must be a superset of those
     * found in the imported file headers. If no reference set id is provided, a
     * best effort is made to associate with a matching reference set.
     * </pre>
     */
    public java.lang.String getReferenceSetId() {
      java.lang.Object ref = referenceSetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        referenceSetId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string reference_set_id = 4;</code>
     *
     * <pre>
     * The reference set to which the imported read group sets are aligned to, if
     * any. The reference names of this reference set must be a superset of those
     * found in the imported file headers. If no reference set id is provided, a
     * best effort is made to associate with a matching reference set.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getReferenceSetIdBytes() {
      java.lang.Object ref = referenceSetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        referenceSetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string reference_set_id = 4;</code>
     *
     * <pre>
     * The reference set to which the imported read group sets are aligned to, if
     * any. The reference names of this reference set must be a superset of those
     * found in the imported file headers. If no reference set id is provided, a
     * best effort is made to associate with a matching reference set.
     * </pre>
     */
    public Builder setReferenceSetId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      referenceSetId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string reference_set_id = 4;</code>
     *
     * <pre>
     * The reference set to which the imported read group sets are aligned to, if
     * any. The reference names of this reference set must be a superset of those
     * found in the imported file headers. If no reference set id is provided, a
     * best effort is made to associate with a matching reference set.
     * </pre>
     */
    public Builder clearReferenceSetId() {
      
      referenceSetId_ = getDefaultInstance().getReferenceSetId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string reference_set_id = 4;</code>
     *
     * <pre>
     * The reference set to which the imported read group sets are aligned to, if
     * any. The reference names of this reference set must be a superset of those
     * found in the imported file headers. If no reference set id is provided, a
     * best effort is made to associate with a matching reference set.
     * </pre>
     */
    public Builder setReferenceSetIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      referenceSetId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList sourceUris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureSourceUrisIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        sourceUris_ = new com.google.protobuf.LazyStringArrayList(sourceUris_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated string source_uris = 2;</code>
     *
     * <pre>
     * A list of URIs pointing at BAM files in Google Cloud Storage.
     * </pre>
     */
    public com.google.protobuf.ProtocolStringList
        getSourceUrisList() {
      return sourceUris_.getUnmodifiableView();
    }
    /**
     * <code>repeated string source_uris = 2;</code>
     *
     * <pre>
     * A list of URIs pointing at BAM files in Google Cloud Storage.
     * </pre>
     */
    public int getSourceUrisCount() {
      return sourceUris_.size();
    }
    /**
     * <code>repeated string source_uris = 2;</code>
     *
     * <pre>
     * A list of URIs pointing at BAM files in Google Cloud Storage.
     * </pre>
     */
    public java.lang.String getSourceUris(int index) {
      return sourceUris_.get(index);
    }
    /**
     * <code>repeated string source_uris = 2;</code>
     *
     * <pre>
     * A list of URIs pointing at BAM files in Google Cloud Storage.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getSourceUrisBytes(int index) {
      return sourceUris_.getByteString(index);
    }
    /**
     * <code>repeated string source_uris = 2;</code>
     *
     * <pre>
     * A list of URIs pointing at BAM files in Google Cloud Storage.
     * </pre>
     */
    public Builder setSourceUris(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSourceUrisIsMutable();
      sourceUris_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string source_uris = 2;</code>
     *
     * <pre>
     * A list of URIs pointing at BAM files in Google Cloud Storage.
     * </pre>
     */
    public Builder addSourceUris(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSourceUrisIsMutable();
      sourceUris_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string source_uris = 2;</code>
     *
     * <pre>
     * A list of URIs pointing at BAM files in Google Cloud Storage.
     * </pre>
     */
    public Builder addAllSourceUris(
        java.lang.Iterable<java.lang.String> values) {
      ensureSourceUrisIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, sourceUris_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string source_uris = 2;</code>
     *
     * <pre>
     * A list of URIs pointing at BAM files in Google Cloud Storage.
     * </pre>
     */
    public Builder clearSourceUris() {
      sourceUris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string source_uris = 2;</code>
     *
     * <pre>
     * A list of URIs pointing at BAM files in Google Cloud Storage.
     * </pre>
     */
    public Builder addSourceUrisBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureSourceUrisIsMutable();
      sourceUris_.add(value);
      onChanged();
      return this;
    }

    private int partitionStrategy_ = 0;
    /**
     * <code>optional .google.genomics.v1.ImportReadGroupSetsRequest.PartitionStrategy partition_strategy = 5;</code>
     *
     * <pre>
     * The partition strategy describes how read groups are partitioned into read
     * group sets.
     * </pre>
     */
    public int getPartitionStrategyValue() {
      return partitionStrategy_;
    }
    /**
     * <code>optional .google.genomics.v1.ImportReadGroupSetsRequest.PartitionStrategy partition_strategy = 5;</code>
     *
     * <pre>
     * The partition strategy describes how read groups are partitioned into read
     * group sets.
     * </pre>
     */
    public Builder setPartitionStrategyValue(int value) {
      partitionStrategy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.genomics.v1.ImportReadGroupSetsRequest.PartitionStrategy partition_strategy = 5;</code>
     *
     * <pre>
     * The partition strategy describes how read groups are partitioned into read
     * group sets.
     * </pre>
     */
    public com.google.genomics.v1.ImportReadGroupSetsRequest.PartitionStrategy getPartitionStrategy() {
      com.google.genomics.v1.ImportReadGroupSetsRequest.PartitionStrategy result = com.google.genomics.v1.ImportReadGroupSetsRequest.PartitionStrategy.valueOf(partitionStrategy_);
      return result == null ? com.google.genomics.v1.ImportReadGroupSetsRequest.PartitionStrategy.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .google.genomics.v1.ImportReadGroupSetsRequest.PartitionStrategy partition_strategy = 5;</code>
     *
     * <pre>
     * The partition strategy describes how read groups are partitioned into read
     * group sets.
     * </pre>
     */
    public Builder setPartitionStrategy(com.google.genomics.v1.ImportReadGroupSetsRequest.PartitionStrategy value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      partitionStrategy_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.genomics.v1.ImportReadGroupSetsRequest.PartitionStrategy partition_strategy = 5;</code>
     *
     * <pre>
     * The partition strategy describes how read groups are partitioned into read
     * group sets.
     * </pre>
     */
    public Builder clearPartitionStrategy() {
      
      partitionStrategy_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.ImportReadGroupSetsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.ImportReadGroupSetsRequest)
  private static final com.google.genomics.v1.ImportReadGroupSetsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.genomics.v1.ImportReadGroupSetsRequest();
  }

  public static com.google.genomics.v1.ImportReadGroupSetsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportReadGroupSetsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ImportReadGroupSetsRequest>() {
    public ImportReadGroupSetsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new ImportReadGroupSetsRequest(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<ImportReadGroupSetsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportReadGroupSetsRequest> getParserForType() {
    return PARSER;
  }

  public com.google.genomics.v1.ImportReadGroupSetsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

