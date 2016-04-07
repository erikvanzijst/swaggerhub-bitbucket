package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Component;
import io.swagger.client.model.Milestone;
import io.swagger.client.model.Repository;
import io.swagger.client.model.User;
import io.swagger.client.model.Version;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-07T21:24:16.972Z")
public class Issue extends Object  {
  
  private String type = null;
  private Object content = null;


  public enum KindEnum {
    BUG("bug"),
    ENHANCEMENT("enhancement"),
    PROPOSAL("proposal"),
    TASK("task");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private KindEnum kind = null;
  private Repository repository = null;
  private Object links = null;
  private String title = null;
  private User reporter = null;
  private Component component = null;
  private Integer votes = null;


  public enum PriorityEnum {
    TRIVIAL("trivial"),
    MINOR("minor"),
    MAJOR("major"),
    CRITICAL("critical"),
    BLOCKER("blocker");

    private String value;

    PriorityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PriorityEnum priority = null;
  private User assignee = null;


  public enum StateEnum {
    NEW("new"),
    OPEN("open"),
    RESOLVED("resolved"),
    ON_HOLD("on hold"),
    INVALID("invalid"),
    DUPLICATE("duplicate"),
    WONTFIX("wontfix"),
    CLOSED("closed");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StateEnum state = null;
  private Version version = null;
  private Date editedOn = null;
  private Date createdOn = null;
  private Milestone milestone = null;
  private Date updatedOn = null;
  private Integer id = null;

  
  /**
   **/
  public Issue type(String type) {
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
   **/
  public Issue content(Object content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("content")
  public Object getContent() {
    return content;
  }
  public void setContent(Object content) {
    this.content = content;
  }

  
  /**
   **/
  public Issue kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("kind")
  public KindEnum getKind() {
    return kind;
  }
  public void setKind(KindEnum kind) {
    this.kind = kind;
  }

  
  /**
   **/
  public Issue repository(Repository repository) {
    this.repository = repository;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("repository")
  public Repository getRepository() {
    return repository;
  }
  public void setRepository(Repository repository) {
    this.repository = repository;
  }

  
  /**
   **/
  public Issue links(Object links) {
    this.links = links;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("links")
  public Object getLinks() {
    return links;
  }
  public void setLinks(Object links) {
    this.links = links;
  }

  
  /**
   **/
  public Issue title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  public Issue reporter(User reporter) {
    this.reporter = reporter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reporter")
  public User getReporter() {
    return reporter;
  }
  public void setReporter(User reporter) {
    this.reporter = reporter;
  }

  
  /**
   **/
  public Issue component(Component component) {
    this.component = component;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("component")
  public Component getComponent() {
    return component;
  }
  public void setComponent(Component component) {
    this.component = component;
  }

  
  /**
   **/
  public Issue votes(Integer votes) {
    this.votes = votes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("votes")
  public Integer getVotes() {
    return votes;
  }
  public void setVotes(Integer votes) {
    this.votes = votes;
  }

  
  /**
   **/
  public Issue priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("priority")
  public PriorityEnum getPriority() {
    return priority;
  }
  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }

  
  /**
   **/
  public Issue assignee(User assignee) {
    this.assignee = assignee;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assignee")
  public User getAssignee() {
    return assignee;
  }
  public void setAssignee(User assignee) {
    this.assignee = assignee;
  }

  
  /**
   **/
  public Issue state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   **/
  public Issue version(Version version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public Version getVersion() {
    return version;
  }
  public void setVersion(Version version) {
    this.version = version;
  }

  
  /**
   **/
  public Issue editedOn(Date editedOn) {
    this.editedOn = editedOn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("edited_on")
  public Date getEditedOn() {
    return editedOn;
  }
  public void setEditedOn(Date editedOn) {
    this.editedOn = editedOn;
  }

  
  /**
   **/
  public Issue createdOn(Date createdOn) {
    this.createdOn = createdOn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("created_on")
  public Date getCreatedOn() {
    return createdOn;
  }
  public void setCreatedOn(Date createdOn) {
    this.createdOn = createdOn;
  }

  
  /**
   **/
  public Issue milestone(Milestone milestone) {
    this.milestone = milestone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("milestone")
  public Milestone getMilestone() {
    return milestone;
  }
  public void setMilestone(Milestone milestone) {
    this.milestone = milestone;
  }

  
  /**
   **/
  public Issue updatedOn(Date updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("updated_on")
  public Date getUpdatedOn() {
    return updatedOn;
  }
  public void setUpdatedOn(Date updatedOn) {
    this.updatedOn = updatedOn;
  }

  
  /**
   **/
  public Issue id(Integer id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Issue issue = (Issue) o;
    return Objects.equals(this.type, issue.type) &&
        Objects.equals(this.content, issue.content) &&
        Objects.equals(this.kind, issue.kind) &&
        Objects.equals(this.repository, issue.repository) &&
        Objects.equals(this.links, issue.links) &&
        Objects.equals(this.title, issue.title) &&
        Objects.equals(this.reporter, issue.reporter) &&
        Objects.equals(this.component, issue.component) &&
        Objects.equals(this.votes, issue.votes) &&
        Objects.equals(this.priority, issue.priority) &&
        Objects.equals(this.assignee, issue.assignee) &&
        Objects.equals(this.state, issue.state) &&
        Objects.equals(this.version, issue.version) &&
        Objects.equals(this.editedOn, issue.editedOn) &&
        Objects.equals(this.createdOn, issue.createdOn) &&
        Objects.equals(this.milestone, issue.milestone) &&
        Objects.equals(this.updatedOn, issue.updatedOn) &&
        Objects.equals(this.id, issue.id) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, content, kind, repository, links, title, reporter, component, votes, priority, assignee, state, version, editedOn, createdOn, milestone, updatedOn, id, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Issue {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    reporter: ").append(toIndentedString(reporter)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    votes: ").append(toIndentedString(votes)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    editedOn: ").append(toIndentedString(editedOn)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

