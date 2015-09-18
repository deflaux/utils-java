// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/reads.proto

package com.google.genomics.v1;

/**
 * Protobuf type {@code google.genomics.v1.ExportReadGroupSetRequest}
 *
 * <pre>
 * The read group set export request.
 * </pre>
 */
public  final class ExportReadGroupSetRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.ExportReadGroupSetRequest)
    ExportReadGroupSetRequestOrBuilder {
  // Use ExportReadGroupSetRequest.newBuilder() to construct.
  private ExportReadGroupSetRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ExportReadGroupSetRequest() {
    projectId_ = "";
    exportUri_ = "";
    readGroupSetId_ = "";
    referenceNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ExportReadGroupSetRequest(
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

            projectId_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            exportUri_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            readGroupSetId_ = s;
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              referenceNames_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000008;
            }
            referenceNames_.add(s);
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        referenceNames_ = referenceNames_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_ExportReadGroupSetRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_ExportReadGroupSetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.ExportReadGroupSetRequest.class, com.google.genomics.v1.ExportReadGroupSetRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PROJECT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object projectId_;
  /**
   * <code>optional string project_id = 1;</code>
   *
   * <pre>
   * The Google Developers Console project number that owns this export.
   * </pre>
   */
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string project_id = 1;</code>
   *
   * <pre>
   * The Google Developers Console project number that owns this export.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPORT_URI_FIELD_NUMBER = 2;
  private volatile java.lang.Object exportUri_;
  /**
   * <code>optional string export_uri = 2;</code>
   *
   * <pre>
   * A Google Cloud Storage URI for the exported BAM file.
   * The currently authenticated user must have write access to the new file.
   * An error will be returned if the URI already contains data.
   * </pre>
   */
  public java.lang.String getExportUri() {
    java.lang.Object ref = exportUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      exportUri_ = s;
      return s;
    }
  }
  /**
   * <code>optional string export_uri = 2;</code>
   *
   * <pre>
   * A Google Cloud Storage URI for the exported BAM file.
   * The currently authenticated user must have write access to the new file.
   * An error will be returned if the URI already contains data.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getExportUriBytes() {
    java.lang.Object ref = exportUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      exportUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int READ_GROUP_SET_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object readGroupSetId_;
  /**
   * <code>optional string read_group_set_id = 3;</code>
   *
   * <pre>
   * The ID of the read group set to export.
   * </pre>
   */
  public java.lang.String getReadGroupSetId() {
    java.lang.Object ref = readGroupSetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      readGroupSetId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string read_group_set_id = 3;</code>
   *
   * <pre>
   * The ID of the read group set to export.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getReadGroupSetIdBytes() {
    java.lang.Object ref = readGroupSetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      readGroupSetId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REFERENCE_NAMES_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList referenceNames_;
  /**
   * <code>repeated string reference_names = 4;</code>
   *
   * <pre>
   * The reference names to export. If this is not specified, all reference
   * sequences, including unmapped reads, are exported.
   * Use `*` to export only unmapped reads.
   * </pre>
   */
  public com.google.protobuf.ProtocolStringList
      getReferenceNamesList() {
    return referenceNames_;
  }
  /**
   * <code>repeated string reference_names = 4;</code>
   *
   * <pre>
   * The reference names to export. If this is not specified, all reference
   * sequences, including unmapped reads, are exported.
   * Use `*` to export only unmapped reads.
   * </pre>
   */
  public int getReferenceNamesCount() {
    return referenceNames_.size();
  }
  /**
   * <code>repeated string reference_names = 4;</code>
   *
   * <pre>
   * The reference names to export. If this is not specified, all reference
   * sequences, including unmapped reads, are exported.
   * Use `*` to export only unmapped reads.
   * </pre>
   */
  public java.lang.String getReferenceNames(int index) {
    return referenceNames_.get(index);
  }
  /**
   * <code>repeated string reference_names = 4;</code>
   *
   * <pre>
   * The reference names to export. If this is not specified, all reference
   * sequences, including unmapped reads, are exported.
   * Use `*` to export only unmapped reads.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getReferenceNamesBytes(int index) {
    return referenceNames_.getByteString(index);
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
    if (!getProjectIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, projectId_);
    }
    if (!getExportUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, exportUri_);
    }
    if (!getReadGroupSetIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, readGroupSetId_);
    }
    for (int i = 0; i < referenceNames_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, referenceNames_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProjectIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, projectId_);
    }
    if (!getExportUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, exportUri_);
    }
    if (!getReadGroupSetIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, readGroupSetId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < referenceNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(referenceNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getReferenceNamesList().size();
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.genomics.v1.ExportReadGroupSetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.ExportReadGroupSetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.ExportReadGroupSetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.ExportReadGroupSetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.ExportReadGroupSetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.ExportReadGroupSetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.ExportReadGroupSetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.genomics.v1.ExportReadGroupSetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.ExportReadGroupSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.ExportReadGroupSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.genomics.v1.ExportReadGroupSetRequest prototype) {
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
   * Protobuf type {@code google.genomics.v1.ExportReadGroupSetRequest}
   *
   * <pre>
   * The read group set export request.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.ExportReadGroupSetRequest)
      com.google.genomics.v1.ExportReadGroupSetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_ExportReadGroupSetRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_ExportReadGroupSetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.ExportReadGroupSetRequest.class, com.google.genomics.v1.ExportReadGroupSetRequest.Builder.class);
    }

    // Construct using com.google.genomics.v1.ExportReadGroupSetRequest.newBuilder()
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
      projectId_ = "";

      exportUri_ = "";

      readGroupSetId_ = "";

      referenceNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_ExportReadGroupSetRequest_descriptor;
    }

    public com.google.genomics.v1.ExportReadGroupSetRequest getDefaultInstanceForType() {
      return com.google.genomics.v1.ExportReadGroupSetRequest.getDefaultInstance();
    }

    public com.google.genomics.v1.ExportReadGroupSetRequest build() {
      com.google.genomics.v1.ExportReadGroupSetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1.ExportReadGroupSetRequest buildPartial() {
      com.google.genomics.v1.ExportReadGroupSetRequest result = new com.google.genomics.v1.ExportReadGroupSetRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.projectId_ = projectId_;
      result.exportUri_ = exportUri_;
      result.readGroupSetId_ = readGroupSetId_;
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        referenceNames_ = referenceNames_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.referenceNames_ = referenceNames_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.genomics.v1.ExportReadGroupSetRequest) {
        return mergeFrom((com.google.genomics.v1.ExportReadGroupSetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.ExportReadGroupSetRequest other) {
      if (other == com.google.genomics.v1.ExportReadGroupSetRequest.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (!other.getExportUri().isEmpty()) {
        exportUri_ = other.exportUri_;
        onChanged();
      }
      if (!other.getReadGroupSetId().isEmpty()) {
        readGroupSetId_ = other.readGroupSetId_;
        onChanged();
      }
      if (!other.referenceNames_.isEmpty()) {
        if (referenceNames_.isEmpty()) {
          referenceNames_ = other.referenceNames_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureReferenceNamesIsMutable();
          referenceNames_.addAll(other.referenceNames_);
        }
        onChanged();
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
      com.google.genomics.v1.ExportReadGroupSetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1.ExportReadGroupSetRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object projectId_ = "";
    /**
     * <code>optional string project_id = 1;</code>
     *
     * <pre>
     * The Google Developers Console project number that owns this export.
     * </pre>
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string project_id = 1;</code>
     *
     * <pre>
     * The Google Developers Console project number that owns this export.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string project_id = 1;</code>
     *
     * <pre>
     * The Google Developers Console project number that owns this export.
     * </pre>
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string project_id = 1;</code>
     *
     * <pre>
     * The Google Developers Console project number that owns this export.
     * </pre>
     */
    public Builder clearProjectId() {
      
      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string project_id = 1;</code>
     *
     * <pre>
     * The Google Developers Console project number that owns this export.
     * </pre>
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object exportUri_ = "";
    /**
     * <code>optional string export_uri = 2;</code>
     *
     * <pre>
     * A Google Cloud Storage URI for the exported BAM file.
     * The currently authenticated user must have write access to the new file.
     * An error will be returned if the URI already contains data.
     * </pre>
     */
    public java.lang.String getExportUri() {
      java.lang.Object ref = exportUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        exportUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string export_uri = 2;</code>
     *
     * <pre>
     * A Google Cloud Storage URI for the exported BAM file.
     * The currently authenticated user must have write access to the new file.
     * An error will be returned if the URI already contains data.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getExportUriBytes() {
      java.lang.Object ref = exportUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        exportUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string export_uri = 2;</code>
     *
     * <pre>
     * A Google Cloud Storage URI for the exported BAM file.
     * The currently authenticated user must have write access to the new file.
     * An error will be returned if the URI already contains data.
     * </pre>
     */
    public Builder setExportUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      exportUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string export_uri = 2;</code>
     *
     * <pre>
     * A Google Cloud Storage URI for the exported BAM file.
     * The currently authenticated user must have write access to the new file.
     * An error will be returned if the URI already contains data.
     * </pre>
     */
    public Builder clearExportUri() {
      
      exportUri_ = getDefaultInstance().getExportUri();
      onChanged();
      return this;
    }
    /**
     * <code>optional string export_uri = 2;</code>
     *
     * <pre>
     * A Google Cloud Storage URI for the exported BAM file.
     * The currently authenticated user must have write access to the new file.
     * An error will be returned if the URI already contains data.
     * </pre>
     */
    public Builder setExportUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      exportUri_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object readGroupSetId_ = "";
    /**
     * <code>optional string read_group_set_id = 3;</code>
     *
     * <pre>
     * The ID of the read group set to export.
     * </pre>
     */
    public java.lang.String getReadGroupSetId() {
      java.lang.Object ref = readGroupSetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        readGroupSetId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string read_group_set_id = 3;</code>
     *
     * <pre>
     * The ID of the read group set to export.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getReadGroupSetIdBytes() {
      java.lang.Object ref = readGroupSetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        readGroupSetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string read_group_set_id = 3;</code>
     *
     * <pre>
     * The ID of the read group set to export.
     * </pre>
     */
    public Builder setReadGroupSetId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      readGroupSetId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string read_group_set_id = 3;</code>
     *
     * <pre>
     * The ID of the read group set to export.
     * </pre>
     */
    public Builder clearReadGroupSetId() {
      
      readGroupSetId_ = getDefaultInstance().getReadGroupSetId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string read_group_set_id = 3;</code>
     *
     * <pre>
     * The ID of the read group set to export.
     * </pre>
     */
    public Builder setReadGroupSetIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      readGroupSetId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList referenceNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureReferenceNamesIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        referenceNames_ = new com.google.protobuf.LazyStringArrayList(referenceNames_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated string reference_names = 4;</code>
     *
     * <pre>
     * The reference names to export. If this is not specified, all reference
     * sequences, including unmapped reads, are exported.
     * Use `*` to export only unmapped reads.
     * </pre>
     */
    public com.google.protobuf.ProtocolStringList
        getReferenceNamesList() {
      return referenceNames_.getUnmodifiableView();
    }
    /**
     * <code>repeated string reference_names = 4;</code>
     *
     * <pre>
     * The reference names to export. If this is not specified, all reference
     * sequences, including unmapped reads, are exported.
     * Use `*` to export only unmapped reads.
     * </pre>
     */
    public int getReferenceNamesCount() {
      return referenceNames_.size();
    }
    /**
     * <code>repeated string reference_names = 4;</code>
     *
     * <pre>
     * The reference names to export. If this is not specified, all reference
     * sequences, including unmapped reads, are exported.
     * Use `*` to export only unmapped reads.
     * </pre>
     */
    public java.lang.String getReferenceNames(int index) {
      return referenceNames_.get(index);
    }
    /**
     * <code>repeated string reference_names = 4;</code>
     *
     * <pre>
     * The reference names to export. If this is not specified, all reference
     * sequences, including unmapped reads, are exported.
     * Use `*` to export only unmapped reads.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getReferenceNamesBytes(int index) {
      return referenceNames_.getByteString(index);
    }
    /**
     * <code>repeated string reference_names = 4;</code>
     *
     * <pre>
     * The reference names to export. If this is not specified, all reference
     * sequences, including unmapped reads, are exported.
     * Use `*` to export only unmapped reads.
     * </pre>
     */
    public Builder setReferenceNames(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureReferenceNamesIsMutable();
      referenceNames_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string reference_names = 4;</code>
     *
     * <pre>
     * The reference names to export. If this is not specified, all reference
     * sequences, including unmapped reads, are exported.
     * Use `*` to export only unmapped reads.
     * </pre>
     */
    public Builder addReferenceNames(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureReferenceNamesIsMutable();
      referenceNames_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string reference_names = 4;</code>
     *
     * <pre>
     * The reference names to export. If this is not specified, all reference
     * sequences, including unmapped reads, are exported.
     * Use `*` to export only unmapped reads.
     * </pre>
     */
    public Builder addAllReferenceNames(
        java.lang.Iterable<java.lang.String> values) {
      ensureReferenceNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, referenceNames_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string reference_names = 4;</code>
     *
     * <pre>
     * The reference names to export. If this is not specified, all reference
     * sequences, including unmapped reads, are exported.
     * Use `*` to export only unmapped reads.
     * </pre>
     */
    public Builder clearReferenceNames() {
      referenceNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string reference_names = 4;</code>
     *
     * <pre>
     * The reference names to export. If this is not specified, all reference
     * sequences, including unmapped reads, are exported.
     * Use `*` to export only unmapped reads.
     * </pre>
     */
    public Builder addReferenceNamesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureReferenceNamesIsMutable();
      referenceNames_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.ExportReadGroupSetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.ExportReadGroupSetRequest)
  private static final com.google.genomics.v1.ExportReadGroupSetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.genomics.v1.ExportReadGroupSetRequest();
  }

  public static com.google.genomics.v1.ExportReadGroupSetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportReadGroupSetRequest>
      PARSER = new com.google.protobuf.AbstractParser<ExportReadGroupSetRequest>() {
    public ExportReadGroupSetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new ExportReadGroupSetRequest(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<ExportReadGroupSetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportReadGroupSetRequest> getParserForType() {
    return PARSER;
  }

  public com.google.genomics.v1.ExportReadGroupSetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

