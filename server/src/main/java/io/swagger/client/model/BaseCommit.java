package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Account;
import io.swagger.client.model.BaseCommit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-07T21:16:53.982Z")
public class BaseCommit extends Object  {
  
  private String type = null;
  private Date date = null;
  private List<BaseCommit> parents = new ArrayList<BaseCommit>();
  private String message = null;
  private String hash = null;
  private Account author = null;

  
  /**
   **/
  public BaseCommit type(String type) {
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
  public BaseCommit date(Date date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  
  /**
   **/
  public BaseCommit parents(List<BaseCommit> parents) {
    this.parents = parents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("parents")
  public List<BaseCommit> getParents() {
    return parents;
  }
  public void setParents(List<BaseCommit> parents) {
    this.parents = parents;
  }

  
  /**
   **/
  public BaseCommit message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  public BaseCommit hash(String hash) {
    this.hash = hash;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hash")
  public String getHash() {
    return hash;
  }
  public void setHash(String hash) {
    this.hash = hash;
  }

  
  /**
   **/
  public BaseCommit author(Account author) {
    this.author = author;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("author")
  public Account getAuthor() {
    return author;
  }
  public void setAuthor(Account author) {
    this.author = author;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseCommit baseCommit = (BaseCommit) o;
    return Objects.equals(this.type, baseCommit.type) &&
        Objects.equals(this.date, baseCommit.date) &&
        Objects.equals(this.parents, baseCommit.parents) &&
        Objects.equals(this.message, baseCommit.message) &&
        Objects.equals(this.hash, baseCommit.hash) &&
        Objects.equals(this.author, baseCommit.author) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, date, parents, message, hash, author, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseCommit {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
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

