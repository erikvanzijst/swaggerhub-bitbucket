package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Account;
import io.swagger.client.model.BaseCommit;
import io.swagger.client.model.Snippet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-07T21:24:16.972Z")
public class SnippetCommit extends BaseCommit  {
  
  private Date date = null;
  private List<BaseCommit> parents = new ArrayList<BaseCommit>();
  private String message = null;
  private String hash = null;
  private Account author = null;
  private Snippet snippet = null;
  private Object links = null;

  
  /**
   **/
  public SnippetCommit date(Date date) {
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
  public SnippetCommit parents(List<BaseCommit> parents) {
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
  public SnippetCommit message(String message) {
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
  public SnippetCommit hash(String hash) {
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
  public SnippetCommit author(Account author) {
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

  
  /**
   **/
  public SnippetCommit snippet(Snippet snippet) {
    this.snippet = snippet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("snippet")
  public Snippet getSnippet() {
    return snippet;
  }
  public void setSnippet(Snippet snippet) {
    this.snippet = snippet;
  }

  
  /**
   **/
  public SnippetCommit links(Object links) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnippetCommit snippetCommit = (SnippetCommit) o;
    return Objects.equals(this.date, snippetCommit.date) &&
        Objects.equals(this.parents, snippetCommit.parents) &&
        Objects.equals(this.message, snippetCommit.message) &&
        Objects.equals(this.hash, snippetCommit.hash) &&
        Objects.equals(this.author, snippetCommit.author) &&
        Objects.equals(this.snippet, snippetCommit.snippet) &&
        Objects.equals(this.links, snippetCommit.links) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, parents, message, hash, author, snippet, links, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnippetCommit {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

