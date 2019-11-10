// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/test/resources/proto/small.proto

package com.github.sisyphsu.smartbuf.benchmark.small;

public final class Small {
  private Small() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UserOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.github.sisyphsu.smartbuf.benchmark.small.User)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    long getId();

    /**
     * <code>bool blocked = 2;</code>
     * @return The blocked.
     */
    boolean getBlocked();

    /**
     * <code>string nickname = 3;</code>
     * @return The nickname.
     */
    java.lang.String getNickname();
    /**
     * <code>string nickname = 3;</code>
     * @return The bytes for nickname.
     */
    com.google.protobuf.ByteString
        getNicknameBytes();

    /**
     * <code>string portrait = 4;</code>
     * @return The portrait.
     */
    java.lang.String getPortrait();
    /**
     * <code>string portrait = 4;</code>
     * @return The bytes for portrait.
     */
    com.google.protobuf.ByteString
        getPortraitBytes();

    /**
     * <code>float score = 5;</code>
     * @return The score.
     */
    float getScore();

    /**
     * <code>int32 loginTimes = 6;</code>
     * @return The loginTimes.
     */
    int getLoginTimes();

    /**
     * <code>int64 createTime = 7;</code>
     * @return The createTime.
     */
    long getCreateTime();
  }
  /**
   * Protobuf type {@code com.github.sisyphsu.smartbuf.benchmark.small.User}
   */
  public  static final class User extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.github.sisyphsu.smartbuf.benchmark.small.User)
      UserOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use User.newBuilder() to construct.
    private User(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private User() {
      nickname_ = "";
      portrait_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new User();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private User(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              id_ = input.readInt64();
              break;
            }
            case 16: {

              blocked_ = input.readBool();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              nickname_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              portrait_ = s;
              break;
            }
            case 45: {

              score_ = input.readFloat();
              break;
            }
            case 48: {

              loginTimes_ = input.readInt32();
              break;
            }
            case 56: {

              createTime_ = input.readInt64();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.sisyphsu.smartbuf.benchmark.small.Small.internal_static_com_github_sisyphsu_smartbuf_benchmark_small_User_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.sisyphsu.smartbuf.benchmark.small.Small.internal_static_com_github_sisyphsu_smartbuf_benchmark_small_User_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.sisyphsu.smartbuf.benchmark.small.Small.User.class, com.github.sisyphsu.smartbuf.benchmark.small.Small.User.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    public long getId() {
      return id_;
    }

    public static final int BLOCKED_FIELD_NUMBER = 2;
    private boolean blocked_;
    /**
     * <code>bool blocked = 2;</code>
     * @return The blocked.
     */
    public boolean getBlocked() {
      return blocked_;
    }

    public static final int NICKNAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object nickname_;
    /**
     * <code>string nickname = 3;</code>
     * @return The nickname.
     */
    public java.lang.String getNickname() {
      java.lang.Object ref = nickname_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nickname_ = s;
        return s;
      }
    }
    /**
     * <code>string nickname = 3;</code>
     * @return The bytes for nickname.
     */
    public com.google.protobuf.ByteString
        getNicknameBytes() {
      java.lang.Object ref = nickname_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nickname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PORTRAIT_FIELD_NUMBER = 4;
    private volatile java.lang.Object portrait_;
    /**
     * <code>string portrait = 4;</code>
     * @return The portrait.
     */
    public java.lang.String getPortrait() {
      java.lang.Object ref = portrait_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        portrait_ = s;
        return s;
      }
    }
    /**
     * <code>string portrait = 4;</code>
     * @return The bytes for portrait.
     */
    public com.google.protobuf.ByteString
        getPortraitBytes() {
      java.lang.Object ref = portrait_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        portrait_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SCORE_FIELD_NUMBER = 5;
    private float score_;
    /**
     * <code>float score = 5;</code>
     * @return The score.
     */
    public float getScore() {
      return score_;
    }

    public static final int LOGINTIMES_FIELD_NUMBER = 6;
    private int loginTimes_;
    /**
     * <code>int32 loginTimes = 6;</code>
     * @return The loginTimes.
     */
    public int getLoginTimes() {
      return loginTimes_;
    }

    public static final int CREATETIME_FIELD_NUMBER = 7;
    private long createTime_;
    /**
     * <code>int64 createTime = 7;</code>
     * @return The createTime.
     */
    public long getCreateTime() {
      return createTime_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0L) {
        output.writeInt64(1, id_);
      }
      if (blocked_ != false) {
        output.writeBool(2, blocked_);
      }
      if (!getNicknameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nickname_);
      }
      if (!getPortraitBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, portrait_);
      }
      if (score_ != 0F) {
        output.writeFloat(5, score_);
      }
      if (loginTimes_ != 0) {
        output.writeInt32(6, loginTimes_);
      }
      if (createTime_ != 0L) {
        output.writeInt64(7, createTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, id_);
      }
      if (blocked_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, blocked_);
      }
      if (!getNicknameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nickname_);
      }
      if (!getPortraitBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, portrait_);
      }
      if (score_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, score_);
      }
      if (loginTimes_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, loginTimes_);
      }
      if (createTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(7, createTime_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.github.sisyphsu.smartbuf.benchmark.small.Small.User)) {
        return super.equals(obj);
      }
      com.github.sisyphsu.smartbuf.benchmark.small.Small.User other = (com.github.sisyphsu.smartbuf.benchmark.small.Small.User) obj;

      if (getId()
          != other.getId()) return false;
      if (getBlocked()
          != other.getBlocked()) return false;
      if (!getNickname()
          .equals(other.getNickname())) return false;
      if (!getPortrait()
          .equals(other.getPortrait())) return false;
      if (java.lang.Float.floatToIntBits(getScore())
          != java.lang.Float.floatToIntBits(
              other.getScore())) return false;
      if (getLoginTimes()
          != other.getLoginTimes()) return false;
      if (getCreateTime()
          != other.getCreateTime()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
      hash = (37 * hash) + BLOCKED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getBlocked());
      hash = (37 * hash) + NICKNAME_FIELD_NUMBER;
      hash = (53 * hash) + getNickname().hashCode();
      hash = (37 * hash) + PORTRAIT_FIELD_NUMBER;
      hash = (53 * hash) + getPortrait().hashCode();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getScore());
      hash = (37 * hash) + LOGINTIMES_FIELD_NUMBER;
      hash = (53 * hash) + getLoginTimes();
      hash = (37 * hash) + CREATETIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCreateTime());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.github.sisyphsu.smartbuf.benchmark.small.Small.User parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.github.sisyphsu.smartbuf.benchmark.small.Small.User parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.github.sisyphsu.smartbuf.benchmark.small.Small.User parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.github.sisyphsu.smartbuf.benchmark.small.Small.User parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.github.sisyphsu.smartbuf.benchmark.small.Small.User parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.github.sisyphsu.smartbuf.benchmark.small.Small.User parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.github.sisyphsu.smartbuf.benchmark.small.Small.User parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.github.sisyphsu.smartbuf.benchmark.small.Small.User parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.github.sisyphsu.smartbuf.benchmark.small.Small.User parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.github.sisyphsu.smartbuf.benchmark.small.Small.User parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.github.sisyphsu.smartbuf.benchmark.small.Small.User parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.github.sisyphsu.smartbuf.benchmark.small.Small.User parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.github.sisyphsu.smartbuf.benchmark.small.Small.User prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.github.sisyphsu.smartbuf.benchmark.small.User}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.github.sisyphsu.smartbuf.benchmark.small.User)
        com.github.sisyphsu.smartbuf.benchmark.small.Small.UserOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.github.sisyphsu.smartbuf.benchmark.small.Small.internal_static_com_github_sisyphsu_smartbuf_benchmark_small_User_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.github.sisyphsu.smartbuf.benchmark.small.Small.internal_static_com_github_sisyphsu_smartbuf_benchmark_small_User_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.github.sisyphsu.smartbuf.benchmark.small.Small.User.class, com.github.sisyphsu.smartbuf.benchmark.small.Small.User.Builder.class);
      }

      // Construct using com.github.sisyphsu.smartbuf.benchmark.small.Small.User.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        id_ = 0L;

        blocked_ = false;

        nickname_ = "";

        portrait_ = "";

        score_ = 0F;

        loginTimes_ = 0;

        createTime_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.github.sisyphsu.smartbuf.benchmark.small.Small.internal_static_com_github_sisyphsu_smartbuf_benchmark_small_User_descriptor;
      }

      @java.lang.Override
      public com.github.sisyphsu.smartbuf.benchmark.small.Small.User getDefaultInstanceForType() {
        return com.github.sisyphsu.smartbuf.benchmark.small.Small.User.getDefaultInstance();
      }

      @java.lang.Override
      public com.github.sisyphsu.smartbuf.benchmark.small.Small.User build() {
        com.github.sisyphsu.smartbuf.benchmark.small.Small.User result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.github.sisyphsu.smartbuf.benchmark.small.Small.User buildPartial() {
        com.github.sisyphsu.smartbuf.benchmark.small.Small.User result = new com.github.sisyphsu.smartbuf.benchmark.small.Small.User(this);
        result.id_ = id_;
        result.blocked_ = blocked_;
        result.nickname_ = nickname_;
        result.portrait_ = portrait_;
        result.score_ = score_;
        result.loginTimes_ = loginTimes_;
        result.createTime_ = createTime_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.github.sisyphsu.smartbuf.benchmark.small.Small.User) {
          return mergeFrom((com.github.sisyphsu.smartbuf.benchmark.small.Small.User)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.github.sisyphsu.smartbuf.benchmark.small.Small.User other) {
        if (other == com.github.sisyphsu.smartbuf.benchmark.small.Small.User.getDefaultInstance()) return this;
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        if (other.getBlocked() != false) {
          setBlocked(other.getBlocked());
        }
        if (!other.getNickname().isEmpty()) {
          nickname_ = other.nickname_;
          onChanged();
        }
        if (!other.getPortrait().isEmpty()) {
          portrait_ = other.portrait_;
          onChanged();
        }
        if (other.getScore() != 0F) {
          setScore(other.getScore());
        }
        if (other.getLoginTimes() != 0) {
          setLoginTimes(other.getLoginTimes());
        }
        if (other.getCreateTime() != 0L) {
          setCreateTime(other.getCreateTime());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.github.sisyphsu.smartbuf.benchmark.small.Small.User parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.github.sisyphsu.smartbuf.benchmark.small.Small.User) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long id_ ;
      /**
       * <code>int64 id = 1;</code>
       * @return The id.
       */
      public long getId() {
        return id_;
      }
      /**
       * <code>int64 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(long value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0L;
        onChanged();
        return this;
      }

      private boolean blocked_ ;
      /**
       * <code>bool blocked = 2;</code>
       * @return The blocked.
       */
      public boolean getBlocked() {
        return blocked_;
      }
      /**
       * <code>bool blocked = 2;</code>
       * @param value The blocked to set.
       * @return This builder for chaining.
       */
      public Builder setBlocked(boolean value) {
        
        blocked_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool blocked = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBlocked() {
        
        blocked_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object nickname_ = "";
      /**
       * <code>string nickname = 3;</code>
       * @return The nickname.
       */
      public java.lang.String getNickname() {
        java.lang.Object ref = nickname_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          nickname_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string nickname = 3;</code>
       * @return The bytes for nickname.
       */
      public com.google.protobuf.ByteString
          getNicknameBytes() {
        java.lang.Object ref = nickname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nickname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string nickname = 3;</code>
       * @param value The nickname to set.
       * @return This builder for chaining.
       */
      public Builder setNickname(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nickname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string nickname = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearNickname() {
        
        nickname_ = getDefaultInstance().getNickname();
        onChanged();
        return this;
      }
      /**
       * <code>string nickname = 3;</code>
       * @param value The bytes for nickname to set.
       * @return This builder for chaining.
       */
      public Builder setNicknameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        nickname_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object portrait_ = "";
      /**
       * <code>string portrait = 4;</code>
       * @return The portrait.
       */
      public java.lang.String getPortrait() {
        java.lang.Object ref = portrait_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          portrait_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string portrait = 4;</code>
       * @return The bytes for portrait.
       */
      public com.google.protobuf.ByteString
          getPortraitBytes() {
        java.lang.Object ref = portrait_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          portrait_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string portrait = 4;</code>
       * @param value The portrait to set.
       * @return This builder for chaining.
       */
      public Builder setPortrait(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        portrait_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string portrait = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPortrait() {
        
        portrait_ = getDefaultInstance().getPortrait();
        onChanged();
        return this;
      }
      /**
       * <code>string portrait = 4;</code>
       * @param value The bytes for portrait to set.
       * @return This builder for chaining.
       */
      public Builder setPortraitBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        portrait_ = value;
        onChanged();
        return this;
      }

      private float score_ ;
      /**
       * <code>float score = 5;</code>
       * @return The score.
       */
      public float getScore() {
        return score_;
      }
      /**
       * <code>float score = 5;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(float value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float score = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0F;
        onChanged();
        return this;
      }

      private int loginTimes_ ;
      /**
       * <code>int32 loginTimes = 6;</code>
       * @return The loginTimes.
       */
      public int getLoginTimes() {
        return loginTimes_;
      }
      /**
       * <code>int32 loginTimes = 6;</code>
       * @param value The loginTimes to set.
       * @return This builder for chaining.
       */
      public Builder setLoginTimes(int value) {
        
        loginTimes_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 loginTimes = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLoginTimes() {
        
        loginTimes_ = 0;
        onChanged();
        return this;
      }

      private long createTime_ ;
      /**
       * <code>int64 createTime = 7;</code>
       * @return The createTime.
       */
      public long getCreateTime() {
        return createTime_;
      }
      /**
       * <code>int64 createTime = 7;</code>
       * @param value The createTime to set.
       * @return This builder for chaining.
       */
      public Builder setCreateTime(long value) {
        
        createTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 createTime = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCreateTime() {
        
        createTime_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.github.sisyphsu.smartbuf.benchmark.small.User)
    }

    // @@protoc_insertion_point(class_scope:com.github.sisyphsu.smartbuf.benchmark.small.User)
    private static final com.github.sisyphsu.smartbuf.benchmark.small.Small.User DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.github.sisyphsu.smartbuf.benchmark.small.Small.User();
    }

    public static com.github.sisyphsu.smartbuf.benchmark.small.Small.User getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<User>
        PARSER = new com.google.protobuf.AbstractParser<User>() {
      @java.lang.Override
      public User parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new User(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<User> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<User> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.github.sisyphsu.smartbuf.benchmark.small.Small.User getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_sisyphsu_smartbuf_benchmark_small_User_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_sisyphsu_smartbuf_benchmark_small_User_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$src/test/resources/proto/small.proto\022," +
      "com.github.sisyphsu.smartbuf.benchmark.s" +
      "mall\"~\n\004User\022\n\n\002id\030\001 \001(\003\022\017\n\007blocked\030\002 \001(" +
      "\010\022\020\n\010nickname\030\003 \001(\t\022\020\n\010portrait\030\004 \001(\t\022\r\n" +
      "\005score\030\005 \001(\002\022\022\n\nloginTimes\030\006 \001(\005\022\022\n\ncrea" +
      "teTime\030\007 \001(\003b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_github_sisyphsu_smartbuf_benchmark_small_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_github_sisyphsu_smartbuf_benchmark_small_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_sisyphsu_smartbuf_benchmark_small_User_descriptor,
        new java.lang.String[] { "Id", "Blocked", "Nickname", "Portrait", "Score", "LoginTimes", "CreateTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
