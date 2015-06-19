// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/references.proto

package com.google.genomics.v1;

public interface ListBasesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.ListBasesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 offset = 1;</code>
   *
   * <pre>
   * The offset position (0-based) of the given `sequence` from the
   * start of this `Reference`. This value will differ for each page
   * in a paginated request.
   * </pre>
   */
  long getOffset();

  /**
   * <code>optional string sequence = 2;</code>
   *
   * <pre>
   * A substring of the bases that make up this reference.
   * </pre>
   */
  java.lang.String getSequence();
  /**
   * <code>optional string sequence = 2;</code>
   *
   * <pre>
   * A substring of the bases that make up this reference.
   * </pre>
   */
  com.google.protobuf.ByteString
      getSequenceBytes();

  /**
   * <code>optional string next_page_token = 3;</code>
   *
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * Provide this value in a subsequent request to return the next page of
   * results. This field will be empty if there aren't any additional results.
   * </pre>
   */
  java.lang.String getNextPageToken();
  /**
   * <code>optional string next_page_token = 3;</code>
   *
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * Provide this value in a subsequent request to return the next page of
   * results. This field will be empty if there aren't any additional results.
   * </pre>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}