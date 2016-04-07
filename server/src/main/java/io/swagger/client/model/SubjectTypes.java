package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SubjectTypesUser;



/**
 * The mapping of resource/subject types pointing to their individual event types.
 **/

@ApiModel(description = "The mapping of resource/subject types pointing to their individual event types.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-07T21:24:16.972Z")
public class SubjectTypes   {
  
  private SubjectTypesUser user = null;
  private SubjectTypesUser repository = null;
  private SubjectTypesUser team = null;

  
  /**
   **/
  public SubjectTypes user(SubjectTypesUser user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public SubjectTypesUser getUser() {
    return user;
  }
  public void setUser(SubjectTypesUser user) {
    this.user = user;
  }

  
  /**
   **/
  public SubjectTypes repository(SubjectTypesUser repository) {
    this.repository = repository;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("repository")
  public SubjectTypesUser getRepository() {
    return repository;
  }
  public void setRepository(SubjectTypesUser repository) {
    this.repository = repository;
  }

  
  /**
   **/
  public SubjectTypes team(SubjectTypesUser team) {
    this.team = team;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("team")
  public SubjectTypesUser getTeam() {
    return team;
  }
  public void setTeam(SubjectTypesUser team) {
    this.team = team;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubjectTypes subjectTypes = (SubjectTypes) o;
    return Objects.equals(this.user, subjectTypes.user) &&
        Objects.equals(this.repository, subjectTypes.repository) &&
        Objects.equals(this.team, subjectTypes.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, repository, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubjectTypes {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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

