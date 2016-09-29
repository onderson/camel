/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.netty4.springboot;

import java.io.File;
import java.util.List;
import java.util.Map;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.group.ChannelGroup;
import io.netty.handler.ssl.SslHandler;
import io.netty.util.concurrent.EventExecutorGroup;
import org.apache.camel.LoggingLevel;
import org.apache.camel.component.netty4.ClientInitializerFactory;
import org.apache.camel.component.netty4.NettyComponent;
import org.apache.camel.component.netty4.NettyServerBootstrapFactory;
import org.apache.camel.component.netty4.ServerInitializerFactory;
import org.apache.camel.component.netty4.TextLineDelimiter;
import org.apache.camel.util.jsse.SSLContextParameters;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * Socket level networking using TCP or UDP with the Netty 4.x library.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.netty4")
public class NettyComponentConfiguration {

    /**
     * The thread pool size for the EventExecutorGroup if its in use. The
     * default value is 16.
     */
    private Integer maximumPoolSize;
    /**
     * To use the NettyConfiguration as configuration when creating endpoints.
     */
    private NettyConfigurationNestedConfiguration configuration;
    /**
     * To use the given EventExecutorGroup
     */
    @NestedConfigurationProperty
    private EventExecutorGroup executorService;

    public Integer getMaximumPoolSize() {
        return maximumPoolSize;
    }

    public void setMaximumPoolSize(Integer maximumPoolSize) {
        this.maximumPoolSize = maximumPoolSize;
    }

    public NettyConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            NettyConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public EventExecutorGroup getExecutorService() {
        return executorService;
    }

    public void setExecutorService(EventExecutorGroup executorService) {
        this.executorService = executorService;
    }

    public static class NettyConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.netty4.NettyConfiguration.class;
        /**
         * Allows to use a timeout for the Netty producer when calling a remote
         * server. By default no timeout is in use. The value is in milli
         * seconds, so eg 30000 is 30 seconds. The requestTimeout is using
         * Netty's ReadTimeoutHandler to trigger the timeout.
         */
        private Long requestTimeout;
        /**
         * Setting to set endpoint as one-way or request-response
         */
        private Boolean sync;
        /**
         * Only used for TCP. If no codec is specified, you can use this flag to
         * indicate a text line based codec; if not specified or the value is
         * false, then Object Serialization is assumed over TCP.
         */
        private Boolean textline;
        /**
         * The max line length to use for the textline codec.
         */
        private Integer decoderMaxLineLength;
        /**
         * The delimiter to use for the textline codec. Possible values are LINE
         * and NULL.
         */
        private TextLineDelimiter delimiter = TextLineDelimiter.LINE;
        /**
         * Whether or not to auto append missing end delimiter when sending
         * using the textline codec.
         */
        private Boolean autoAppendDelimiter;
        /**
         * The encoding (a charset name) to use for the textline codec. If not
         * provided, Camel will use the JVM default Charset.
         */
        private String encoding;
        /**
         * A list of decoders to be used. You can use a String which have values
         * separated by comma, and have the values be looked up in the Registry.
         * Just remember to prefix the value with # so Camel knows it should
         * lookup.
         */
        private List decoders;
        /**
         * A list of encoders to be used. You can use a String which have values
         * separated by comma, and have the values be looked up in the Registry.
         * Just remember to prefix the value with # so Camel knows it should
         * lookup.
         */
        private List encoders;
        /**
         * A custom ChannelHandler class that can be used to perform special
         * marshalling of outbound payloads.
         */
        @NestedConfigurationProperty
        @Deprecated
        private ChannelHandler encoder;
        /**
         * A custom ChannelHandler class that can be used to perform special
         * marshalling of inbound payloads.
         */
        @NestedConfigurationProperty
        @Deprecated
        private ChannelHandler decoder;
        /**
         * Whether or not to disconnect(close) from Netty Channel right after
         * use. Can be used for both consumer and producer.
         */
        private Boolean disconnect;
        /**
         * Channels can be lazily created to avoid exceptions, if the remote
         * server is not up and running when the Camel producer is started.
         */
        private Boolean lazyChannelCreation;
        /**
         * Only used for TCP. You can transfer the exchange over the wire
         * instead of just the body. The following fields are transferred: In
         * body, Out body, fault body, In headers, Out headers, fault headers,
         * exchange properties, exchange exception. This requires that the
         * objects are serializable. Camel will exclude any non-serializable
         * objects and log it at WARN level.
         */
        private Boolean transferExchange;
        /**
         * Only used for TCP when transferExchange is true. When set to true,
         * serializable objects in headers and properties will be added to the
         * exchange. Otherwise Camel will exclude any non-serializable objects
         * and log it at WARN level.
         */
        private Boolean allowSerializedHeaders;
        /**
         * If sync is enabled then this option dictates NettyConsumer if it
         * should disconnect where there is no reply to send back.
         */
        private Boolean disconnectOnNoReply;
        /**
         * If sync is enabled this option dictates NettyConsumer which logging
         * level to use when logging a there is no reply to send back.
         */
        private LoggingLevel noReplyLogLevel = LoggingLevel.WARN;
        /**
         * If the server (NettyConsumer) catches an exception then its logged
         * using this logging level.
         */
        private LoggingLevel serverExceptionCaughtLogLevel = LoggingLevel.WARN;
        /**
         * If the server (NettyConsumer) catches an
         * java.nio.channels.ClosedChannelException then its logged using this
         * logging level. This is used to avoid logging the closed channel
         * exceptions, as clients can disconnect abruptly and then cause a flood
         * of closed exceptions in the Netty server.
         */
        private LoggingLevel serverClosedChannelExceptionCaughtLogLevel = LoggingLevel.DEBUG;
        /**
         * The netty component installs a default codec if both, encoder/deocder
         * is null and textline is false. Setting allowDefaultCodec to false
         * prevents the netty component from installing a default codec as the
         * first element in the filter chain.
         */
        private Boolean allowDefaultCodec;
        /**
         * @deprecated use #setClientInitializerFactory
         */
        @NestedConfigurationProperty
        @Deprecated
        private ClientInitializerFactory clientPipelineFactory;
        /**
         * To use a custom ClientInitializerFactory
         */
        @NestedConfigurationProperty
        private ClientInitializerFactory clientInitializerFactory;
        /**
         * Whether to use ordered thread pool, to ensure events are processed
         * orderly on the same channel.
         */
        private Boolean usingExecutorService;
        /**
         * Sets the cap on the number of objects that can be allocated by the
         * pool (checked out to clients, or idle awaiting checkout) at a given
         * time. Use a negative value for no limit.
         */
        private Integer producerPoolMaxActive;
        /**
         * Sets the minimum number of instances allowed in the producer pool
         * before the evictor thread (if active) spawns new objects.
         */
        private Integer producerPoolMinIdle;
        /**
         * Sets the cap on the number of "idle" instances in the pool.
         */
        private Integer producerPoolMaxIdle;
        /**
         * Sets the minimum amount of time (value in millis) an object may sit
         * idle in the pool before it is eligible for eviction by the idle
         * object evictor.
         */
        private Long producerPoolMinEvictableIdle;
        /**
         * Whether producer pool is enabled or not. Important: Do not turn this
         * off, as the pooling is needed for handling concurrency and reliable
         * request/reply.
         */
        private Boolean producerPoolEnabled;
        /**
         * This option supports connection less udp sending which is a real fire
         * and forget. A connected udp send receive the PortUnreachableException
         * if no one is listen on the receiving port.
         */
        private Boolean udpConnectionlessSending;
        /**
         * If the clientMode is true, netty consumer will connect the address as
         * a TCP client.
         */
        private Boolean clientMode;
        /**
         * If the useByteBuf is true, netty producer will turn the message body
         * into {@link ByteBuf} before sending it out.
         */
        private Boolean useByteBuf;
        /**
         * For UDP only. If enabled the using byte array codec instead of Java
         * serialization protocol.
         */
        private Boolean udpByteArrayCodec;
        /**
         * This option allows producers to reuse the same Netty {@link Channel}
         * for the lifecycle of processing the {@link Exchange} . This is
         * useable if you need to call a server multiple times in a Camel route
         * and want to use the same network connection. When using this the
         * channel is not returned to the connection pool until the
         * {@link Exchange} is done; or disconnected if the disconnect option is
         * set to true.
         * <p/>
         * The reused {@link Channel} is stored on the {@link Exchange} as an
         * exchange property with the key {@link NettyConstants#NETTY_CHANNEL}
         * which allows you to obtain the channel during routing and use it as
         * well.
         */
        private Boolean reuseChannel;
        /**
         * The protocol to use which can be tcp or udp.
         */
        private String protocol;
        /**
         * The hostname.
         * <p/>
         * For the consumer the hostname is localhost or 0.0.0.0 For the
         * producer the hostname is the remote host to connect to
         */
        private String host;
        /**
         * The host port number
         */
        private Integer port;
        /**
         * Setting to choose Multicast over UDP
         */
        private Boolean broadcast;
        /**
         * The TCP/UDP buffer sizes to be used during outbound communication.
         * Size is bytes.
         */
        private Integer sendBufferSize;
        /**
         * The TCP/UDP buffer sizes to be used during inbound communication.
         * Size is bytes.
         */
        private Integer receiveBufferSize;
        /**
         * Configures the buffer size predictor. See details at Jetty
         * documentation and this mail thread.
         */
        private Integer receiveBufferSizePredictor;
        /**
         * When netty works on nio mode, it uses default workerCount parameter
         * from Netty, which is cpu_core_threads*2. User can use this operation
         * to override the default workerCount from Netty
         */
        private Integer workerCount;
        /**
         * When netty works on nio mode, it uses default bossCount parameter
         * from Netty, which is 1. User can use this operation to override the
         * default bossCount from Netty
         */
        private Integer bossCount;
        /**
         * Setting to ensure socket is not closed due to inactivity
         */
        private Boolean keepAlive;
        /**
         * Setting to improve TCP protocol performance
         */
        private Boolean tcpNoDelay;
        /**
         * Setting to facilitate socket multiplexing
         */
        private Boolean reuseAddress;
        /**
         * Time to wait for a socket connection to be available. Value is in
         * millis.
         */
        private Integer connectTimeout;
        /**
         * Allows to configure a backlog for netty consumer (server). Note the
         * backlog is just a best effort depending on the OS. Setting this
         * option to a value such as 200, 500 or 1000, tells the TCP stack how
         * long the "accept" queue can be If this option is not configured, then
         * the backlog depends on OS setting.
         */
        private Integer backlog;
        /**
         * Setting to specify whether SSL encryption is applied to this endpoint
         */
        private Boolean ssl;
        /**
         * When enabled and in SSL mode, then the Netty consumer will enrich the
         * Camel Message with headers having information about the client
         * certificate such as subject name, issuer name, serial number, and the
         * valid date range.
         */
        private Boolean sslClientCertHeaders;
        /**
         * Reference to a class that could be used to return an SSL Handler
         */
        @NestedConfigurationProperty
        private SslHandler sslHandler;
        /**
         * To configure security using SSLContextParameters
         */
        @NestedConfigurationProperty
        private SSLContextParameters sslContextParameters;
        /**
         * Configures whether the server needs client authentication when using
         * SSL.
         */
        private Boolean needClientAuth;
        /**
         * Client side certificate keystore to be used for encryption
         */
        @Deprecated
        private File keyStoreFile;
        /**
         * Server side certificate keystore to be used for encryption
         */
        @Deprecated
        private File trustStoreFile;
        /**
         * Client side certificate keystore to be used for encryption. Is loaded
         * by default from classpath, but you can prefix with "classpath:",
         * "file:", or "http:" to load the resource from different systems.
         */
        private String keyStoreResource;
        /**
         * Server side certificate keystore to be used for encryption. Is loaded
         * by default from classpath, but you can prefix with "classpath:",
         * "file:", or "http:" to load the resource from different systems.
         */
        private String trustStoreResource;
        /**
         * Keystore format to be used for payload encryption. Defaults to "JKS"
         * if not set
         */
        private String keyStoreFormat;
        /**
         * Security provider to be used for payload encryption. Defaults to
         * "SunX509" if not set.
         */
        private String securityProvider;
        /**
         * Password setting to use in order to encrypt/decrypt payloads sent
         * using SSH
         */
        private String passphrase;
        /**
         * @deprecated use #setServerInitializerFactory
         */
        @NestedConfigurationProperty
        @Deprecated
        private ServerInitializerFactory serverPipelineFactory;
        /**
         * To use a custom ServerInitializerFactory
         */
        @NestedConfigurationProperty
        private ServerInitializerFactory serverInitializerFactory;
        /**
         * To use a custom NettyServerBootstrapFactory
         */
        @NestedConfigurationProperty
        private NettyServerBootstrapFactory nettyServerBootstrapFactory;
        /**
         * Allows to configure additional netty options using "option." as
         * prefix. For example "option.child.keepAlive=false" to set the netty
         * option "child.keepAlive=false". See the Netty documentation for
         * possible options that can be used.
         */
        private Map options;
        /**
         * Whether to use native transport instead of NIO. Native transport
         * takes advantage of the host operating system and is only supported on
         * some platforms. You need to add the netty JAR for the host operating
         * system you are using. See more details at:
         * http://netty.io/wiki/native-transports.html
         */
        private Boolean nativeTransport;
        /**
         * Set the BossGroup which could be used for handling the new connection
         * of the server side across the NettyEndpoint
         */
        @NestedConfigurationProperty
        private EventLoopGroup bossGroup;
        /**
         * To use a explicit EventLoopGroup as the boss thread pool. For example
         * to share a thread pool with multiple consumers. By default each
         * consumer has their own boss pool with 1 core thread.
         */
        @NestedConfigurationProperty
        private EventLoopGroup workerGroup;
        /**
         * To use a explicit ChannelGroup.
         */
        @NestedConfigurationProperty
        private ChannelGroup channelGroup;
        /**
         * When using UDP then this option can be used to specify a network
         * interface by its name, such as eth0 to join a multicast group.
         */
        private String networkInterface;
        /**
         * Which protocols to enable when using SSL
         */
        private String enabledProtocols = "DEFAULT_ENABLED_PROTOCOLS";
        private Boolean reconnect;
        private Integer reconnectInterval;

        public Long getRequestTimeout() {
            return requestTimeout;
        }

        public void setRequestTimeout(Long requestTimeout) {
            this.requestTimeout = requestTimeout;
        }

        public Boolean getSync() {
            return sync;
        }

        public void setSync(Boolean sync) {
            this.sync = sync;
        }

        public Boolean getTextline() {
            return textline;
        }

        public void setTextline(Boolean textline) {
            this.textline = textline;
        }

        public Integer getDecoderMaxLineLength() {
            return decoderMaxLineLength;
        }

        public void setDecoderMaxLineLength(Integer decoderMaxLineLength) {
            this.decoderMaxLineLength = decoderMaxLineLength;
        }

        public TextLineDelimiter getDelimiter() {
            return delimiter;
        }

        public void setDelimiter(TextLineDelimiter delimiter) {
            this.delimiter = delimiter;
        }

        public Boolean getAutoAppendDelimiter() {
            return autoAppendDelimiter;
        }

        public void setAutoAppendDelimiter(Boolean autoAppendDelimiter) {
            this.autoAppendDelimiter = autoAppendDelimiter;
        }

        public String getEncoding() {
            return encoding;
        }

        public void setEncoding(String encoding) {
            this.encoding = encoding;
        }

        public List getDecoders() {
            return decoders;
        }

        public void setDecoders(List decoders) {
            this.decoders = decoders;
        }

        public List getEncoders() {
            return encoders;
        }

        public void setEncoders(List encoders) {
            this.encoders = encoders;
        }

        @Deprecated
        @DeprecatedConfigurationProperty
        public ChannelHandler getEncoder() {
            return encoder;
        }

        @Deprecated
        public void setEncoder(ChannelHandler encoder) {
            this.encoder = encoder;
        }

        @Deprecated
        @DeprecatedConfigurationProperty
        public ChannelHandler getDecoder() {
            return decoder;
        }

        @Deprecated
        public void setDecoder(ChannelHandler decoder) {
            this.decoder = decoder;
        }

        public Boolean getDisconnect() {
            return disconnect;
        }

        public void setDisconnect(Boolean disconnect) {
            this.disconnect = disconnect;
        }

        public Boolean getLazyChannelCreation() {
            return lazyChannelCreation;
        }

        public void setLazyChannelCreation(Boolean lazyChannelCreation) {
            this.lazyChannelCreation = lazyChannelCreation;
        }

        public Boolean getTransferExchange() {
            return transferExchange;
        }

        public void setTransferExchange(Boolean transferExchange) {
            this.transferExchange = transferExchange;
        }

        public Boolean getAllowSerializedHeaders() {
            return allowSerializedHeaders;
        }

        public void setAllowSerializedHeaders(Boolean allowSerializedHeaders) {
            this.allowSerializedHeaders = allowSerializedHeaders;
        }

        public Boolean getDisconnectOnNoReply() {
            return disconnectOnNoReply;
        }

        public void setDisconnectOnNoReply(Boolean disconnectOnNoReply) {
            this.disconnectOnNoReply = disconnectOnNoReply;
        }

        public LoggingLevel getNoReplyLogLevel() {
            return noReplyLogLevel;
        }

        public void setNoReplyLogLevel(LoggingLevel noReplyLogLevel) {
            this.noReplyLogLevel = noReplyLogLevel;
        }

        public LoggingLevel getServerExceptionCaughtLogLevel() {
            return serverExceptionCaughtLogLevel;
        }

        public void setServerExceptionCaughtLogLevel(
                LoggingLevel serverExceptionCaughtLogLevel) {
            this.serverExceptionCaughtLogLevel = serverExceptionCaughtLogLevel;
        }

        public LoggingLevel getServerClosedChannelExceptionCaughtLogLevel() {
            return serverClosedChannelExceptionCaughtLogLevel;
        }

        public void setServerClosedChannelExceptionCaughtLogLevel(
                LoggingLevel serverClosedChannelExceptionCaughtLogLevel) {
            this.serverClosedChannelExceptionCaughtLogLevel = serverClosedChannelExceptionCaughtLogLevel;
        }

        public Boolean getAllowDefaultCodec() {
            return allowDefaultCodec;
        }

        public void setAllowDefaultCodec(Boolean allowDefaultCodec) {
            this.allowDefaultCodec = allowDefaultCodec;
        }

        @Deprecated
        @DeprecatedConfigurationProperty
        public ClientInitializerFactory getClientPipelineFactory() {
            return clientPipelineFactory;
        }

        @Deprecated
        public void setClientPipelineFactory(
                ClientInitializerFactory clientPipelineFactory) {
            this.clientPipelineFactory = clientPipelineFactory;
        }

        public ClientInitializerFactory getClientInitializerFactory() {
            return clientInitializerFactory;
        }

        public void setClientInitializerFactory(
                ClientInitializerFactory clientInitializerFactory) {
            this.clientInitializerFactory = clientInitializerFactory;
        }

        public Boolean getUsingExecutorService() {
            return usingExecutorService;
        }

        public void setUsingExecutorService(Boolean usingExecutorService) {
            this.usingExecutorService = usingExecutorService;
        }

        public Integer getProducerPoolMaxActive() {
            return producerPoolMaxActive;
        }

        public void setProducerPoolMaxActive(Integer producerPoolMaxActive) {
            this.producerPoolMaxActive = producerPoolMaxActive;
        }

        public Integer getProducerPoolMinIdle() {
            return producerPoolMinIdle;
        }

        public void setProducerPoolMinIdle(Integer producerPoolMinIdle) {
            this.producerPoolMinIdle = producerPoolMinIdle;
        }

        public Integer getProducerPoolMaxIdle() {
            return producerPoolMaxIdle;
        }

        public void setProducerPoolMaxIdle(Integer producerPoolMaxIdle) {
            this.producerPoolMaxIdle = producerPoolMaxIdle;
        }

        public Long getProducerPoolMinEvictableIdle() {
            return producerPoolMinEvictableIdle;
        }

        public void setProducerPoolMinEvictableIdle(
                Long producerPoolMinEvictableIdle) {
            this.producerPoolMinEvictableIdle = producerPoolMinEvictableIdle;
        }

        public Boolean getProducerPoolEnabled() {
            return producerPoolEnabled;
        }

        public void setProducerPoolEnabled(Boolean producerPoolEnabled) {
            this.producerPoolEnabled = producerPoolEnabled;
        }

        public Boolean getUdpConnectionlessSending() {
            return udpConnectionlessSending;
        }

        public void setUdpConnectionlessSending(Boolean udpConnectionlessSending) {
            this.udpConnectionlessSending = udpConnectionlessSending;
        }

        public Boolean getClientMode() {
            return clientMode;
        }

        public void setClientMode(Boolean clientMode) {
            this.clientMode = clientMode;
        }

        public Boolean getUseByteBuf() {
            return useByteBuf;
        }

        public void setUseByteBuf(Boolean useByteBuf) {
            this.useByteBuf = useByteBuf;
        }

        public Boolean getUdpByteArrayCodec() {
            return udpByteArrayCodec;
        }

        public void setUdpByteArrayCodec(Boolean udpByteArrayCodec) {
            this.udpByteArrayCodec = udpByteArrayCodec;
        }

        public Boolean getReuseChannel() {
            return reuseChannel;
        }

        public void setReuseChannel(Boolean reuseChannel) {
            this.reuseChannel = reuseChannel;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Boolean getBroadcast() {
            return broadcast;
        }

        public void setBroadcast(Boolean broadcast) {
            this.broadcast = broadcast;
        }

        public Integer getSendBufferSize() {
            return sendBufferSize;
        }

        public void setSendBufferSize(Integer sendBufferSize) {
            this.sendBufferSize = sendBufferSize;
        }

        public Integer getReceiveBufferSize() {
            return receiveBufferSize;
        }

        public void setReceiveBufferSize(Integer receiveBufferSize) {
            this.receiveBufferSize = receiveBufferSize;
        }

        public Integer getReceiveBufferSizePredictor() {
            return receiveBufferSizePredictor;
        }

        public void setReceiveBufferSizePredictor(
                Integer receiveBufferSizePredictor) {
            this.receiveBufferSizePredictor = receiveBufferSizePredictor;
        }

        public Integer getWorkerCount() {
            return workerCount;
        }

        public void setWorkerCount(Integer workerCount) {
            this.workerCount = workerCount;
        }

        public Integer getBossCount() {
            return bossCount;
        }

        public void setBossCount(Integer bossCount) {
            this.bossCount = bossCount;
        }

        public Boolean getKeepAlive() {
            return keepAlive;
        }

        public void setKeepAlive(Boolean keepAlive) {
            this.keepAlive = keepAlive;
        }

        public Boolean getTcpNoDelay() {
            return tcpNoDelay;
        }

        public void setTcpNoDelay(Boolean tcpNoDelay) {
            this.tcpNoDelay = tcpNoDelay;
        }

        public Boolean getReuseAddress() {
            return reuseAddress;
        }

        public void setReuseAddress(Boolean reuseAddress) {
            this.reuseAddress = reuseAddress;
        }

        public Integer getConnectTimeout() {
            return connectTimeout;
        }

        public void setConnectTimeout(Integer connectTimeout) {
            this.connectTimeout = connectTimeout;
        }

        public Integer getBacklog() {
            return backlog;
        }

        public void setBacklog(Integer backlog) {
            this.backlog = backlog;
        }

        public Boolean getSsl() {
            return ssl;
        }

        public void setSsl(Boolean ssl) {
            this.ssl = ssl;
        }

        public Boolean getSslClientCertHeaders() {
            return sslClientCertHeaders;
        }

        public void setSslClientCertHeaders(Boolean sslClientCertHeaders) {
            this.sslClientCertHeaders = sslClientCertHeaders;
        }

        public SslHandler getSslHandler() {
            return sslHandler;
        }

        public void setSslHandler(SslHandler sslHandler) {
            this.sslHandler = sslHandler;
        }

        public SSLContextParameters getSslContextParameters() {
            return sslContextParameters;
        }

        public void setSslContextParameters(
                SSLContextParameters sslContextParameters) {
            this.sslContextParameters = sslContextParameters;
        }

        public Boolean getNeedClientAuth() {
            return needClientAuth;
        }

        public void setNeedClientAuth(Boolean needClientAuth) {
            this.needClientAuth = needClientAuth;
        }

        @Deprecated
        @DeprecatedConfigurationProperty
        public File getKeyStoreFile() {
            return keyStoreFile;
        }

        @Deprecated
        public void setKeyStoreFile(File keyStoreFile) {
            this.keyStoreFile = keyStoreFile;
        }

        @Deprecated
        @DeprecatedConfigurationProperty
        public File getTrustStoreFile() {
            return trustStoreFile;
        }

        @Deprecated
        public void setTrustStoreFile(File trustStoreFile) {
            this.trustStoreFile = trustStoreFile;
        }

        public String getKeyStoreResource() {
            return keyStoreResource;
        }

        public void setKeyStoreResource(String keyStoreResource) {
            this.keyStoreResource = keyStoreResource;
        }

        public String getTrustStoreResource() {
            return trustStoreResource;
        }

        public void setTrustStoreResource(String trustStoreResource) {
            this.trustStoreResource = trustStoreResource;
        }

        public String getKeyStoreFormat() {
            return keyStoreFormat;
        }

        public void setKeyStoreFormat(String keyStoreFormat) {
            this.keyStoreFormat = keyStoreFormat;
        }

        public String getSecurityProvider() {
            return securityProvider;
        }

        public void setSecurityProvider(String securityProvider) {
            this.securityProvider = securityProvider;
        }

        public String getPassphrase() {
            return passphrase;
        }

        public void setPassphrase(String passphrase) {
            this.passphrase = passphrase;
        }

        @Deprecated
        @DeprecatedConfigurationProperty
        public ServerInitializerFactory getServerPipelineFactory() {
            return serverPipelineFactory;
        }

        @Deprecated
        public void setServerPipelineFactory(
                ServerInitializerFactory serverPipelineFactory) {
            this.serverPipelineFactory = serverPipelineFactory;
        }

        public ServerInitializerFactory getServerInitializerFactory() {
            return serverInitializerFactory;
        }

        public void setServerInitializerFactory(
                ServerInitializerFactory serverInitializerFactory) {
            this.serverInitializerFactory = serverInitializerFactory;
        }

        public NettyServerBootstrapFactory getNettyServerBootstrapFactory() {
            return nettyServerBootstrapFactory;
        }

        public void setNettyServerBootstrapFactory(
                NettyServerBootstrapFactory nettyServerBootstrapFactory) {
            this.nettyServerBootstrapFactory = nettyServerBootstrapFactory;
        }

        public Map getOptions() {
            return options;
        }

        public void setOptions(Map options) {
            this.options = options;
        }

        public Boolean getNativeTransport() {
            return nativeTransport;
        }

        public void setNativeTransport(Boolean nativeTransport) {
            this.nativeTransport = nativeTransport;
        }

        public EventLoopGroup getBossGroup() {
            return bossGroup;
        }

        public void setBossGroup(EventLoopGroup bossGroup) {
            this.bossGroup = bossGroup;
        }

        public EventLoopGroup getWorkerGroup() {
            return workerGroup;
        }

        public void setWorkerGroup(EventLoopGroup workerGroup) {
            this.workerGroup = workerGroup;
        }

        public ChannelGroup getChannelGroup() {
            return channelGroup;
        }

        public void setChannelGroup(ChannelGroup channelGroup) {
            this.channelGroup = channelGroup;
        }

        public String getNetworkInterface() {
            return networkInterface;
        }

        public void setNetworkInterface(String networkInterface) {
            this.networkInterface = networkInterface;
        }

        public String getEnabledProtocols() {
            return enabledProtocols;
        }

        public void setEnabledProtocols(String enabledProtocols) {
            this.enabledProtocols = enabledProtocols;
        }

        public Boolean getReconnect() {
            return reconnect;
        }

        public void setReconnect(Boolean reconnect) {
            this.reconnect = reconnect;
        }

        public Integer getReconnectInterval() {
            return reconnectInterval;
        }

        public void setReconnectInterval(Integer reconnectInterval) {
            this.reconnectInterval = reconnectInterval;
        }
    }
}