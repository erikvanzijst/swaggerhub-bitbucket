package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Component;
import java.util.ArrayList;
import java.util.List;



/**
 * A paginated list of issue tracker components.
 **/

@ApiModel(description = "A paginated list of issue tracker components.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-07T21:16:53.982Z")
public class PaginatedComponents   {
  
  private String next = null;
  private List<Component> values = new ArrayList<Component>();
  private Integer pagelen = null;
  private Integer size = null;
  private Integer page = null;
  private String previous = null;

  
  /**
   * Link to the next page if it exists. The last page of a collection does not have this value. Use this link to navigate the result set and refrain from constructing your own URLs.
   **/
  public PaginatedComponents next(String next) {
    this.next = next;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Link to the next page if it exists. The last page of a collection does not have this value. Use this link to navigate the result set and refrain from constructing your own URLs.")
  @JsonProperty("next")
  public String getNext() {
    return next;
  }
  public void setNext(String next) {
    this.next = next;
  }

  
  /**
   **/
  public PaginatedComponents values(List<Component> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("values")
  public List<Component> getValues() {
    return values;
  }
  public void setValues(List<Component> values) {
    this.values = values;
  }

  
  /**
   * Current number of objects on the existing page. The default value is 10 with 100 being the maximum allowed value. Individual APIs may enforce different values.
   * minimum: 1.0
   **/
  public PaginatedComponents pagelen(Integer pagelen) {
    this.pagelen = pagelen;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Current number of objects on the existing page. The default value is 10 with 100 being the maximum allowed value. Individual APIs may enforce different values.")
  @JsonProperty("pagelen")
  public Integer getPagelen() {
    return pagelen;
  }
  public void setPagelen(Integer pagelen) {
    this.pagelen = pagelen;
  }

  
  /**
   * Total number of objects in the response. This is an optional element that is not provided in all responses, as it can be expensive to compute.
   * minimum: 0.0
   **/
  public PaginatedComponents size(Integer size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total number of objects in the response. This is an optional element that is not provided in all responses, as it can be expensive to compute.")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  
  /**
   * Page number of the current results. This is an optional element that is not provided in all responses.
   * minimum: 1.0
   **/
  public PaginatedComponents page(Integer page) {
    this.page = page;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Page number of the current results. This is an optional element that is not provided in all responses.")
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }
  public void setPage(Integer page) {
    this.page = page;
  }

  
  /**
   * Link to previous page if it exists. A collections first page does not have this value. This is an optional element that is not provided in all responses. Some result sets strictly support forward navigation and never provide previous links. Clients must anticipate that backwards navigation is not always available. Use this link to navigate the result set and refrain from constructing your own URLs.
   **/
  public PaginatedComponents previous(String previous) {
    this.previous = previous;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Link to previous page if it exists. A collections first page does not have this value. This is an optional element that is not provided in all responses. Some result sets strictly support forward navigation and never provide previous links. Clients must anticipate that backwards navigation is not always available. Use this link to navigate the result set and refrain from constructing your own URLs.")
  @JsonProperty("previous")
  public String getPrevious() {
    return previous;
  }
  public void setPrevious(String previous) {
    this.previous = previous;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedComponents paginatedComponents = (PaginatedComponents) o;
    return Objects.equals(this.next, paginatedComponents.next) &&
        Objects.equals(this.values, paginatedComponents.values) &&
        Objects.equals(this.pagelen, paginatedComponents.pagelen) &&
        Objects.equals(this.size, paginatedComponents.size) &&
        Objects.equals(this.page, paginatedComponents.page) &&
        Objects.equals(this.previous, paginatedComponents.previous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, values, pagelen, size, page, previous);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedComponents {\n");
    
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    pagelen: ").append(toIndentedString(pagelen)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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

