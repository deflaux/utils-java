// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/variants.proto

package com.google.genomics.v1;

public interface StreamVariantsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.StreamVariantsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
   */
  java.util.List<com.google.genomics.v1.Variant> 
      getVariantsList();
  /**
   * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
   */
  com.google.genomics.v1.Variant getVariants(int index);
  /**
   * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
   */
  int getVariantsCount();
  /**
   * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
   */
  java.util.List<? extends com.google.genomics.v1.VariantOrBuilder> 
      getVariantsOrBuilderList();
  /**
   * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
   */
  com.google.genomics.v1.VariantOrBuilder getVariantsOrBuilder(
      int index);
}