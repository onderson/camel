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
package org.apache.camel.component.google.calendar.springboot;

import javax.annotation.Generated;
import org.apache.camel.component.google.calendar.internal.GoogleCalendarApiName;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The google-calendar component provides access to Google Calendar.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.google-calendar")
public class GoogleCalendarComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * To use the shared configuration
     */
    private GoogleCalendarConfigurationNestedConfiguration configuration;
    /**
     * To use the GoogleCalendarClientFactory as factory for creating the
     * client. Will by default use BatchGoogleCalendarClientFactory. The option
     * is a
     * org.apache.camel.component.google.calendar.GoogleCalendarClientFactory
     * type.
     */
    private String clientFactory;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public GoogleCalendarConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            GoogleCalendarConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getClientFactory() {
        return clientFactory;
    }

    public void setClientFactory(String clientFactory) {
        this.clientFactory = clientFactory;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class GoogleCalendarConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.google.calendar.GoogleCalendarConfiguration.class;
        /**
         * What kind of operation to perform
         */
        private GoogleCalendarApiName apiName;
        /**
         * What sub operation to use for the selected operation
         */
        private String methodName;
        /**
         * Client ID of the calendar application
         */
        private String clientId;
        /**
         * The emailAddress of the Google Service Account.
         */
        private String emailAddress;
        /**
         * Client secret of the calendar application
         */
        private String clientSecret;
        /**
         * OAuth 2 access token. This typically expires after an hour so
         * refreshToken is recommended for long term usage.
         */
        private String accessToken;
        /**
         * OAuth 2 refresh token. Using this, the Google Calendar component can
         * obtain a new accessToken whenever the current one expires - a
         * necessity if the application is long-lived.
         */
        private String refreshToken;
        /**
         * Google calendar application name. Example would be
         * "camel-google-calendar/1.0"
         */
        private String applicationName;
        /**
         * Specifies the level of permissions you want a calendar application to
         * have to a user account. You can separate multiple scopes by comma.
         * See https://developers.google.com/google-apps/calendar/auth for more
         * info.
         */
        private String scopes = "https://www.googleapis.com/auth/calendar";
        /**
         * The name of the p12 file which has the private key to use with the
         * Google Service Account.
         */
        private String p12FileName;
        /**
         * The email address of the user the application is trying to
         * impersonate in the service account flow
         */
        private String user;

        public GoogleCalendarApiName getApiName() {
            return apiName;
        }

        public void setApiName(GoogleCalendarApiName apiName) {
            this.apiName = apiName;
        }

        public String getMethodName() {
            return methodName;
        }

        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }

        public String getClientId() {
            return clientId;
        }

        public void setClientId(String clientId) {
            this.clientId = clientId;
        }

        public String getEmailAddress() {
            return emailAddress;
        }

        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        public String getClientSecret() {
            return clientSecret;
        }

        public void setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
        }

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        public String getRefreshToken() {
            return refreshToken;
        }

        public void setRefreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
        }

        public String getApplicationName() {
            return applicationName;
        }

        public void setApplicationName(String applicationName) {
            this.applicationName = applicationName;
        }

        public String getScopes() {
            return scopes;
        }

        public void setScopes(String scopes) {
            this.scopes = scopes;
        }

        public String getP12FileName() {
            return p12FileName;
        }

        public void setP12FileName(String p12FileName) {
            this.p12FileName = p12FileName;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }
    }
}