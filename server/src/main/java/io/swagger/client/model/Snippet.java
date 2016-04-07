package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Account;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-07T21:16:53.982Z")
public class Snippet extends Object  {
  
  private String type = null;


  public enum ScmEnum {
    HG("hg"),
    GIT("git");

    private String value;

    ScmEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ScmEnum scm = null;
  private String title = null;
  private Account creator = null;
  private Date createdOn = null;
  private Account owner = null;
  private Date updatedOn = null;
  private Integer id = null;
  private Boolean isPrivate = null;

  
  /**
   **/
  public Snippet type(String type) {
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
   * The DVCS used to store the snippet.
   **/
  public Snippet scm(ScmEnum scm) {
    this.scm = scm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The DVCS used to store the snippet.")
  @JsonProperty("scm")
  public ScmEnum getScm() {
    return scm;
  }
  public void setScm(ScmEnum scm) {
    this.scm = scm;
  }

  
  /**
   **/
  public Snippet title(String title) {
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
  public Snippet creator(Account creator) {
    this.creator = creator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("creator")
  public Account getCreator() {
    return creator;
  }
  public void setCreator(Account creator) {
    this.creator = creator;
  }

  
  /**
   **/
  public Snippet createdOn(Date createdOn) {
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
  public Snippet owner(Account owner) {
    this.owner = owner;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("owner")
  public Account getOwner() {
    return owner;
  }
  public void setOwner(Account owner) {
    this.owner = owner;
  }

  
  /**
   **/
  public Snippet updatedOn(Date updatedOn) {
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
   * minimum: 0.0
   **/
  public Snippet id(Integer id) {
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

  
  /**
   **/
  public Snippet isPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("is_private")
  public Boolean getIsPrivate() {
    return isPrivate;
  }
  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Snippet snippet = (Snippet) o;
    return Objects.equals(this.type, snippet.type) &&
        Objects.equals(this.scm, snippet.scm) &&
        Objects.equals(this.title, snippet.title) &&
        Objects.equals(this.creator, snippet.creator) &&
        Objects.equals(this.createdOn, snippet.createdOn) &&
        Objects.equals(this.owner, snippet.owner) &&
        Objects.equals(this.updatedOn, snippet.updatedOn) &&
        Objects.equals(this.id, snippet.id) &&
        Objects.equals(this.isPrivate, snippet.isPrivate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, scm, title, creator, createdOn, owner, updatedOn, id, isPrivate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Snippet {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    scm: ").append(toIndentedString(scm)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
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

