/*
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
package org.apache.camel.component.robotframework.springboot;

import java.io.File;
import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Represents a RobotFramework endpoint.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.robotframework")
public class RobotFrameworkComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the robotframework component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * The configuration
     */
    private RobotFrameworkCamelConfigurationNestedConfiguration configuration;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;

    public RobotFrameworkCamelConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            RobotFrameworkCamelConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public static class RobotFrameworkCamelConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.robotframework.RobotFrameworkCamelConfiguration.class;
        /**
         * Sets the name of the top-level tests suites.
         */
        private String name;
        /**
         * Sets the documentation of the top-level tests suites.
         */
        private String document;
        /**
         * Sets free metadata for the top level tests suites. comma seperated
         * list of string resulting as List<String>
         */
        private String metadata;
        /**
         * Sets the tags(s) to all executed tests cases. List<String>
         */
        private String tags;
        /**
         * Selects the tests cases by name. List<String>
         */
        private String tests;
        /**
         * Selects the tests suites by name. List<String>
         */
        private String suites;
        /**
         * Selects the tests cases by tags. List<String>
         */
        private String includes;
        /**
         * Selects the tests cases by tags. List<String>
         */
        private String excludes;
        /**
         * Tests that have the given tags are considered critical. List<String>
         */
        private String criticalTags;
        /**
         * Tests that have the given tags are not critical. List<String>
         */
        private String nonCriticalTags;
        /**
         * Sets the execution mode for this tests run. Note that this setting
         * has been deprecated in Robot Framework 2.8. Use separate dryryn,
         * skipTeardownOnExit, exitOnFailure, and randomize settings instead.
         */
        private String runMode;
        /**
         * Sets dryrun mode on use. In the dry run mode tests are run without
         * executing keywords originating from test libraries. Useful for
         * validating test data syntax.
         */
        private Boolean dryrun = false;
        /**
         * Sets whether the teardowns are skipped if the test execution is
         * prematurely stopped.
         */
        private Boolean skipTeardownOnExit = false;
        /**
         * Sets robot to stop execution immediately if a critical test fails.
         */
        private Boolean exitOnFailure = false;
        /**
         * Sets the test execution order to be randomized. Valid values are all,
         * suite, and test
         */
        private String randomize;
        /**
         * Sets individual variables. Use the format "name:value" List<String>
         */
        private String variables;
        /**
         * Sets variables using variables files. Use the format "path:args"
         * List<String>
         */
        private String variableFiles;
        /**
         * Configures where generated reports are to be placed.
         */
        private File outputDirectory;
        /**
         * Sets the path to the generated output file.
         */
        private File output;
        /**
         * Sets the path to the generated log file.
         */
        private File log;
        /**
         * Sets the path to the generated report file.
         */
        private File report;
        /**
         * Sets the path to the generated XUnit compatible result file, relative
         * to outputDirectory. The file is in xml format. By default, the file
         * name is derived from the testCasesDirectory parameter, replacing
         * blanks in the directory name by underscores.
         */
        private File xunitFile;
        /**
         * A debug file that is written during execution.
         */
        private File debugFile;
        /**
         * Adds a timestamp to all output files.
         */
        private Boolean timestampOutputs = false;
        /**
         * Splits output and log files.
         */
        private String splitOutputs;
        /**
         * Sets a title for the generated tests log.
         */
        private String logTitle;
        /**
         * Sets a title for the generated tests report.
         */
        private String reportTitle;
        /**
         * Sets a title for the generated summary report.
         */
        private String summaryTitle;
        /**
         * Sets background colors for the generated report and summary.
         */
        private String reportBackground;
        /**
         * Sets the threshold level for logging.
         */
        private String logLevel;
        /**
         * Defines how many levels to show in the Statistics by Suite table in
         * outputs.
         */
        private String suiteStatLevel;
        /**
         * Includes only these tags in the Statistics by Tag and Test Details by
         * Tag tables in outputs. List<String>
         */
        private String tagStatIncludes;
        /**
         * Excludes these tags from the Statistics by Tag and Test Details by
         * Tag tables in outputs. List<String>
         */
        private String tagStatExcludes;
        /**
         * Creates combined statistics based on tags. Use the format
         * "tags:title" List<String>
         */
        private String combinedTagStats;
        /**
         * Adds documentation to the specified tags. List<String>
         */
        private String tagDocs;
        /**
         * Adds external links to the Statistics by Tag table in outputs. Use
         * the format "pattern:link:title" List<String>
         */
        private String tagStatLinks;
        /**
         * Sets multiple listeners for monitoring tests execution. Use the
         * format "ListenerWithArgs:arg1:arg2" or simply "ListenerWithoutArgs"
         * List<String>
         */
        private String listeners;
        /**
         * Sets a single listener for monitoring tests execution
         */
        private String listener;
        /**
         * Show a warning when an invalid file is skipped.
         */
        private Boolean warnOnSkippedFiles = false;
        /**
         * Width of the monitor output. Default is 78.
         */
        private String monitorWidth = "78";
        /**
         * Using ANSI colors in console. Normally colors work in unixes but not
         * in Windows. Default is 'on'. <ul> <li>'on' - use colors in unixes but
         * not in Windows</li> <li>'off' - never use colors</li> <li>'force' -
         * always use colors (also in Windows)</li> </ul>
         */
        private String monitorColors;
        /**
         * A text file to read more arguments from.
         */
        private File argumentFile;
        /**
         * Executes tests also if the top level test suite is empty. Useful e.g.
         * with --include/--exclude when it is not an error that no test matches
         * the condition.
         */
        private Boolean runEmptySuite = false;
        /**
         * Re-run failed tests, based on output.xml file.
         */
        private File runFailed;
        /**
         * If true, sets the return code to zero regardless of failures in test
         * cases. Error codes are returned normally.
         */
        private Boolean noStatusReturnCode = false;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDocument() {
            return document;
        }

        public void setDocument(String document) {
            this.document = document;
        }

        public String getMetadata() {
            return metadata;
        }

        public void setMetadata(String metadata) {
            this.metadata = metadata;
        }

        public String getTags() {
            return tags;
        }

        public void setTags(String tags) {
            this.tags = tags;
        }

        public String getTests() {
            return tests;
        }

        public void setTests(String tests) {
            this.tests = tests;
        }

        public String getSuites() {
            return suites;
        }

        public void setSuites(String suites) {
            this.suites = suites;
        }

        public String getIncludes() {
            return includes;
        }

        public void setIncludes(String includes) {
            this.includes = includes;
        }

        public String getExcludes() {
            return excludes;
        }

        public void setExcludes(String excludes) {
            this.excludes = excludes;
        }

        public String getCriticalTags() {
            return criticalTags;
        }

        public void setCriticalTags(String criticalTags) {
            this.criticalTags = criticalTags;
        }

        public String getNonCriticalTags() {
            return nonCriticalTags;
        }

        public void setNonCriticalTags(String nonCriticalTags) {
            this.nonCriticalTags = nonCriticalTags;
        }

        public String getRunMode() {
            return runMode;
        }

        public void setRunMode(String runMode) {
            this.runMode = runMode;
        }

        public Boolean getDryrun() {
            return dryrun;
        }

        public void setDryrun(Boolean dryrun) {
            this.dryrun = dryrun;
        }

        public Boolean getSkipTeardownOnExit() {
            return skipTeardownOnExit;
        }

        public void setSkipTeardownOnExit(Boolean skipTeardownOnExit) {
            this.skipTeardownOnExit = skipTeardownOnExit;
        }

        public Boolean getExitOnFailure() {
            return exitOnFailure;
        }

        public void setExitOnFailure(Boolean exitOnFailure) {
            this.exitOnFailure = exitOnFailure;
        }

        public String getRandomize() {
            return randomize;
        }

        public void setRandomize(String randomize) {
            this.randomize = randomize;
        }

        public String getVariables() {
            return variables;
        }

        public void setVariables(String variables) {
            this.variables = variables;
        }

        public String getVariableFiles() {
            return variableFiles;
        }

        public void setVariableFiles(String variableFiles) {
            this.variableFiles = variableFiles;
        }

        public File getOutputDirectory() {
            return outputDirectory;
        }

        public void setOutputDirectory(File outputDirectory) {
            this.outputDirectory = outputDirectory;
        }

        public File getOutput() {
            return output;
        }

        public void setOutput(File output) {
            this.output = output;
        }

        public File getLog() {
            return log;
        }

        public void setLog(File log) {
            this.log = log;
        }

        public File getReport() {
            return report;
        }

        public void setReport(File report) {
            this.report = report;
        }

        public File getXunitFile() {
            return xunitFile;
        }

        public void setXunitFile(File xunitFile) {
            this.xunitFile = xunitFile;
        }

        public File getDebugFile() {
            return debugFile;
        }

        public void setDebugFile(File debugFile) {
            this.debugFile = debugFile;
        }

        public Boolean getTimestampOutputs() {
            return timestampOutputs;
        }

        public void setTimestampOutputs(Boolean timestampOutputs) {
            this.timestampOutputs = timestampOutputs;
        }

        public String getSplitOutputs() {
            return splitOutputs;
        }

        public void setSplitOutputs(String splitOutputs) {
            this.splitOutputs = splitOutputs;
        }

        public String getLogTitle() {
            return logTitle;
        }

        public void setLogTitle(String logTitle) {
            this.logTitle = logTitle;
        }

        public String getReportTitle() {
            return reportTitle;
        }

        public void setReportTitle(String reportTitle) {
            this.reportTitle = reportTitle;
        }

        public String getSummaryTitle() {
            return summaryTitle;
        }

        public void setSummaryTitle(String summaryTitle) {
            this.summaryTitle = summaryTitle;
        }

        public String getReportBackground() {
            return reportBackground;
        }

        public void setReportBackground(String reportBackground) {
            this.reportBackground = reportBackground;
        }

        public String getLogLevel() {
            return logLevel;
        }

        public void setLogLevel(String logLevel) {
            this.logLevel = logLevel;
        }

        public String getSuiteStatLevel() {
            return suiteStatLevel;
        }

        public void setSuiteStatLevel(String suiteStatLevel) {
            this.suiteStatLevel = suiteStatLevel;
        }

        public String getTagStatIncludes() {
            return tagStatIncludes;
        }

        public void setTagStatIncludes(String tagStatIncludes) {
            this.tagStatIncludes = tagStatIncludes;
        }

        public String getTagStatExcludes() {
            return tagStatExcludes;
        }

        public void setTagStatExcludes(String tagStatExcludes) {
            this.tagStatExcludes = tagStatExcludes;
        }

        public String getCombinedTagStats() {
            return combinedTagStats;
        }

        public void setCombinedTagStats(String combinedTagStats) {
            this.combinedTagStats = combinedTagStats;
        }

        public String getTagDocs() {
            return tagDocs;
        }

        public void setTagDocs(String tagDocs) {
            this.tagDocs = tagDocs;
        }

        public String getTagStatLinks() {
            return tagStatLinks;
        }

        public void setTagStatLinks(String tagStatLinks) {
            this.tagStatLinks = tagStatLinks;
        }

        public String getListeners() {
            return listeners;
        }

        public void setListeners(String listeners) {
            this.listeners = listeners;
        }

        public String getListener() {
            return listener;
        }

        public void setListener(String listener) {
            this.listener = listener;
        }

        public Boolean getWarnOnSkippedFiles() {
            return warnOnSkippedFiles;
        }

        public void setWarnOnSkippedFiles(Boolean warnOnSkippedFiles) {
            this.warnOnSkippedFiles = warnOnSkippedFiles;
        }

        public String getMonitorWidth() {
            return monitorWidth;
        }

        public void setMonitorWidth(String monitorWidth) {
            this.monitorWidth = monitorWidth;
        }

        public String getMonitorColors() {
            return monitorColors;
        }

        public void setMonitorColors(String monitorColors) {
            this.monitorColors = monitorColors;
        }

        public File getArgumentFile() {
            return argumentFile;
        }

        public void setArgumentFile(File argumentFile) {
            this.argumentFile = argumentFile;
        }

        public Boolean getRunEmptySuite() {
            return runEmptySuite;
        }

        public void setRunEmptySuite(Boolean runEmptySuite) {
            this.runEmptySuite = runEmptySuite;
        }

        public File getRunFailed() {
            return runFailed;
        }

        public void setRunFailed(File runFailed) {
            this.runFailed = runFailed;
        }

        public Boolean getNoStatusReturnCode() {
            return noStatusReturnCode;
        }

        public void setNoStatusReturnCode(Boolean noStatusReturnCode) {
            this.noStatusReturnCode = noStatusReturnCode;
        }
    }
}