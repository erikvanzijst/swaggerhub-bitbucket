package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Snippet;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-07T21:24:16.972Z")
public class SnippetComment extends Object  {
  
  private String type = null;
  private Snippet snippet = null;
  private Object links = null;

  
  /**
   **/
  public SnippetComment type(String type) {
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
  public SnippetComment snippet(Snippet snippet) {
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
  public SnippetComment links(Object links) {
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
    SnippetComment snippetComment = (SnippetComment) o;
    return Objects.equals(this.type, snippetComment.type) &&
        Objects.equals(this.snippet, snippetComment.snippet) &&
        Objects.equals(this.links, snippetComment.links) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, snippet, links, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnippetComment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

