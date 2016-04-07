package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * An event, associated with a resource or subject type.
 **/

@ApiModel(description = "An event, associated with a resource or subject type.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-07T21:16:53.982Z")
public class HookEvent   {
  
  private String category = null;


  public enum EventEnum {
    PULLREQUEST_UPDATED("pullrequest:updated"),
    REPO_COMMIT_STATUS_CREATED("repo:commit_status_created"),
    REPO_FORK("repo:fork"),
    ISSUE_COMMENT_CREATED("issue:comment_created"),
    PULLREQUEST_REJECTED("pullrequest:rejected"),
    PULLREQUEST_FULFILLED("pullrequest:fulfilled"),
    PULLREQUEST_COMMENT_CREATED("pullrequest:comment_created"),
    PULLREQUEST_COMMENT_DELETED("pullrequest:comment_deleted"),
    ISSUE_CREATED("issue:created"),
    REPO_COMMIT_COMMENT_CREATED("repo:commit_comment_created"),
    PULLREQUEST_APPROVED("pullrequest:approved"),
    REPO_COMMIT_STATUS_UPDATED("repo:commit_status_updated"),
    PULLREQUEST_COMMENT_UPDATED("pullrequest:comment_updated"),
    ISSUE_UPDATED("issue:updated"),
    PULLREQUEST_UNAPPROVED("pullrequest:unapproved"),
    PULLREQUEST_CREATED("pullrequest:created"),
    REPO_PUSH("repo:push");

    private String value;

    EventEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private EventEnum event = null;
  private String description = null;
  private String label = null;

  
  /**
   * The category this event belongs to.
   **/
  public HookEvent category(String category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The category this event belongs to.")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  
  /**
   * The event identifier.
   **/
  public HookEvent event(EventEnum event) {
    this.event = event;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The event identifier.")
  @JsonProperty("event")
  public EventEnum getEvent() {
    return event;
  }
  public void setEvent(EventEnum event) {
    this.event = event;
  }

  
  /**
   * More detailed description of the webhook event type.
   **/
  public HookEvent description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "More detailed description of the webhook event type.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Summary of the webhook event type.
   **/
  public HookEvent label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Summary of the webhook event type.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HookEvent hookEvent = (HookEvent) o;
    return Objects.equals(this.category, hookEvent.category) &&
        Objects.equals(this.event, hookEvent.event) &&
        Objects.equals(this.description, hookEvent.description) &&
        Objects.equals(this.label, hookEvent.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, event, description, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HookEvent {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

