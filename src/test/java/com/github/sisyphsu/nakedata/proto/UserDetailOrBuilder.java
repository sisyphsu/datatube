// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources/proto/test.proto

package com.github.sisyphsu.nakedata.proto;

public interface UserDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.github.sisyphsu.nakedata.proto.UserDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>int32 age = 2;</code>
   */
  int getAge();

  /**
   * <code>string nickname = 3;</code>
   */
  java.lang.String getNickname();
  /**
   * <code>string nickname = 3;</code>
   */
  com.google.protobuf.ByteString
      getNicknameBytes();

  /**
   * <code>string avatarUrl = 4;</code>
   */
  java.lang.String getAvatarUrl();
  /**
   * <code>string avatarUrl = 4;</code>
   */
  com.google.protobuf.ByteString
      getAvatarUrlBytes();

  /**
   * <code>int64 createTime = 10;</code>
   */
  long getCreateTime();

  /**
   * <code>int64 updateTime = 11;</code>
   */
  long getUpdateTime();
}
