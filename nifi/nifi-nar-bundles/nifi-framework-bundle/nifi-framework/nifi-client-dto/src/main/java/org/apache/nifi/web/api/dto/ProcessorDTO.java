/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.web.api.dto;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlType;

/**
 * Details for a processor within this NiFi.
 */
@XmlType(name = "processor")
public class ProcessorDTO extends NiFiComponentDTO {

    private String name;
    private String type;
    private String state;
    private Map<String, String> style;
    private List<RelationshipDTO> relationships;
    private String description;
    private Boolean supportsParallelProcessing;
    private Boolean supportsEventDriven;

    private ProcessorConfigDTO config;

    private Collection<String> validationErrors;

    public ProcessorDTO() {
        super();
    }

    /**
     * The name of this processor.
     *
     * @return This processors name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The type of this processor.
     *
     * @return This processors type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return The state of this processor. Possible states are 'RUNNING', 'STOPPED',
     * and 'DISABLED'
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return The styles for this processor. (Currently only supports color)
     */
    public Map<String, String> getStyle() {
        return style;
    }

    public void setStyle(Map<String, String> style) {
        this.style = style;
    }

    /**
     * @return whether this processor supports parallel processing
     */
    public Boolean getSupportsParallelProcessing() {
        return supportsParallelProcessing;
    }

    public void setSupportsParallelProcessing(Boolean supportsParallelProcessing) {
        this.supportsParallelProcessing = supportsParallelProcessing;
    }

    /**
     * @return whether this processor supports event driven scheduling
     */
    public Boolean getSupportsEventDriven() {
        return supportsEventDriven;
    }

    public void setSupportsEventDriven(Boolean supportsEventDriven) {
        this.supportsEventDriven = supportsEventDriven;
    }

    /**
     * Gets the available relationships that this processor currently supports.
     *
     * @return The available relationships
     */
    public List<RelationshipDTO> getRelationships() {
        return relationships;
    }

    public void setRelationships(List<RelationshipDTO> relationships) {
        this.relationships = relationships;
    }

    /**
     * The configuration details for this processor. These details will be
     * included in a response if the verbose flag is set to true.
     *
     * @return The processor configuration details
     */
    public ProcessorConfigDTO getConfig() {
        return config;
    }

    public void setConfig(ProcessorConfigDTO config) {
        this.config = config;
    }

    /**
     * Gets the validation errors from this processor. These validation errors
     * represent the problems with the processor that must be resolved before it
     * can be started.
     *
     * @return The validation errors
     */
    public Collection<String> getValidationErrors() {
        return validationErrors;
    }

    public void setValidationErrors(Collection<String> validationErrors) {
        this.validationErrors = validationErrors;
    }

    /**
     * @return the description for this processor
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

}
