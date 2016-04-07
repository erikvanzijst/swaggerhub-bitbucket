package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-07T21:16:53.982Z")
public class WebhookSubscription extends Object  {
  
  private String type = null;


  public enum SubjectTypeEnum {
    USER("user"),
    REPOSITORY("repository"),
    TEAM("team");

    private String value;

    SubjectTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private SubjectTypeEnum subjectType = null;
  private String uuid = null;
  private String url = null;
  private Date createdAt = null;
  private String description = null;
  private Boolean active = null;


  public enum EventsEnum {
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

    EventsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<EventsEnum> events = new ArrayList<EventsEnum>();
  private Object subject = null;

  
  /**
   **/
  public WebhookSubscription type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * The type of entity, which is `repository` in the case of webhook subscriptions on repositories.
   **/
  public WebhookSubscription subjectType(SubjectTypeEnum subjectType) {
    this.subjectType = subjectType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of entity, which is `repository` in the case of webhook subscriptions on repositories.")
  @JsonProperty("subject_type")
  public SubjectTypeEnum getSubjectType() {
    return subjectType;
  }
  public void setSubjectType(SubjectTypeEnum subjectType) {
    this.subjectType = subjectType;
  }

  
  /**
   * The webhook's id
   **/
  public WebhookSubscription uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The webhook's id")
  @JsonProperty("uuid")
  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  /**
   * The URL events get delivered to.
   **/
  public WebhookSubscription url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL events get delivered to.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   **/
  public WebhookSubscription createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  
  /**
   * A user-defined description of the webhook.
   **/
  public WebhookSubscription description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A user-defined description of the webhook.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public WebhookSubscription active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  
  /**
   * The events this webhook is subscribed to.
   **/
  public WebhookSubscription events(List<EventsEnum> events) {
    this.events = events;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The events this webhook is subscribed to.")
  @JsonProperty("events")
  public List<EventsEnum> getEvents() {
    return events;
  }
  public void setEvents(List<EventsEnum> events) {
    this.events = events;
  }

  
  /**
   **/
  public WebhookSubscription subject(Object subject) {
    this.subject = subject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("subject")
  public Object getSubject() {
    return subject;
  }
  public void setSubject(Object subject) {
    this.subject = subject;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookSubscription webhookSubscription = (WebhookSubscription) o;
    return Objects.equals(this.type, webhookSubscription.type) &&
        Objects.equals(this.subjectType, webhookSubscription.subjectType) &&
        Objects.equals(this.uuid, webhookSubscription.uuid) &&
        Objects.equals(this.url, webhookSubscription.url) &&
        Objects.equals(this.createdAt, webhookSubscription.createdAt) &&
        Objects.equals(this.description, webhookSubscription.description) &&
        Objects.equals(this.active, webhookSubscription.active) &&
        Objects.equals(this.events, webhookSubscription.events) &&
        Objects.equals(this.subject, webhookSubscription.subject) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, subjectType, uuid, url, createdAt, description, active, events, subject, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookSubscription {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

