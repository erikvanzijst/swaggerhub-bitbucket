package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Account;
import io.swagger.client.model.Repository;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-07T21:16:53.982Z")
public class Repository extends Object  {
  
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
  private Boolean hasWiki = null;
  private String uuid = null;
  private Object links = null;


  public enum ForkPolicyEnum {
    ALLOW_FORKS("allow_forks"),
    NO_PUBLIC_FORKS("no_public_forks"),
    NO_FORKS("no_forks");

    private String value;

    ForkPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ForkPolicyEnum forkPolicy = null;
  private String description = null;
  private String language = null;
  private Date createdOn = null;
  private Repository parent = null;
  private String fullName = null;
  private Boolean hasIssues = null;
  private Account owner = null;
  private Date updatedOn = null;
  private Integer size = null;
  private Boolean isPrivate = null;
  private String name = null;

  
  /**
   **/
  public Repository type(String type) {
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
  public Repository scm(ScmEnum scm) {
    this.scm = scm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scm")
  public ScmEnum getScm() {
    return scm;
  }
  public void setScm(ScmEnum scm) {
    this.scm = scm;
  }

  
  /**
   **/
  public Repository hasWiki(Boolean hasWiki) {
    this.hasWiki = hasWiki;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("has_wiki")
  public Boolean getHasWiki() {
    return hasWiki;
  }
  public void setHasWiki(Boolean hasWiki) {
    this.hasWiki = hasWiki;
  }

  
  /**
   * The repository's immutable id. This can be used as a substitute for the slug segment in URLs. Doing this guarantees your URLs will survive renaming of the repository by its owner, or even transfer of the repository to a different user.
   **/
  public Repository uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The repository's immutable id. This can be used as a substitute for the slug segment in URLs. Doing this guarantees your URLs will survive renaming of the repository by its owner, or even transfer of the repository to a different user.")
  @JsonProperty("uuid")
  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  /**
   **/
  public Repository links(Object links) {
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
   * Controls the rules for forking this repository.\n\n\n\n\n* **allow_forks**: unrestricted forking\n* **no_public_forks**: restrict forking to private forks (forks cannot\n\n\n\n  be made public later)\n\n\n\n* **no_forks**: deny all forking\n
   **/
  public Repository forkPolicy(ForkPolicyEnum forkPolicy) {
    this.forkPolicy = forkPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Controls the rules for forking this repository.\n\n\n\n\n* **allow_forks**: unrestricted forking\n* **no_public_forks**: restrict forking to private forks (forks cannot\n\n\n\n  be made public later)\n\n\n\n* **no_forks**: deny all forking\n")
  @JsonProperty("fork_policy")
  public ForkPolicyEnum getForkPolicy() {
    return forkPolicy;
  }
  public void setForkPolicy(ForkPolicyEnum forkPolicy) {
    this.forkPolicy = forkPolicy;
  }

  
  /**
   **/
  public Repository description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public Repository language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  
  /**
   **/
  public Repository createdOn(Date createdOn) {
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
  public Repository parent(Repository parent) {
    this.parent = parent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("parent")
  public Repository getParent() {
    return parent;
  }
  public void setParent(Repository parent) {
    this.parent = parent;
  }

  
  /**
   * The concatenation of the repository owner's username and the slugified name, e.g. \"evzijst/interruptingcow\". This is the same string used in Bitbucket URLs.
   **/
  public Repository fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The concatenation of the repository owner's username and the slugified name, e.g. \"evzijst/interruptingcow\". This is the same string used in Bitbucket URLs.")
  @JsonProperty("full_name")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  
  /**
   **/
  public Repository hasIssues(Boolean hasIssues) {
    this.hasIssues = hasIssues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("has_issues")
  public Boolean getHasIssues() {
    return hasIssues;
  }
  public void setHasIssues(Boolean hasIssues) {
    this.hasIssues = hasIssues;
  }

  
  /**
   **/
  public Repository owner(Account owner) {
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
  public Repository updatedOn(Date updatedOn) {
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
  public Repository size(Integer size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  
  /**
   **/
  public Repository isPrivate(Boolean isPrivate) {
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

  
  /**
   **/
  public Repository name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Repository repository = (Repository) o;
    return Objects.equals(this.type, repository.type) &&
        Objects.equals(this.scm, repository.scm) &&
        Objects.equals(this.hasWiki, repository.hasWiki) &&
        Objects.equals(this.uuid, repository.uuid) &&
        Objects.equals(this.links, repository.links) &&
        Objects.equals(this.forkPolicy, repository.forkPolicy) &&
        Objects.equals(this.description, repository.description) &&
        Objects.equals(this.language, repository.language) &&
        Objects.equals(this.createdOn, repository.createdOn) &&
        Objects.equals(this.parent, repository.parent) &&
        Objects.equals(this.fullName, repository.fullName) &&
        Objects.equals(this.hasIssues, repository.hasIssues) &&
        Objects.equals(this.owner, repository.owner) &&
        Objects.equals(this.updatedOn, repository.updatedOn) &&
        Objects.equals(this.size, repository.size) &&
        Objects.equals(this.isPrivate, repository.isPrivate) &&
        Objects.equals(this.name, repository.name) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, scm, hasWiki, uuid, links, forkPolicy, description, language, createdOn, parent, fullName, hasIssues, owner, updatedOn, size, isPrivate, name, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Repository {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    scm: ").append(toIndentedString(scm)).append("\n");
    sb.append("    hasWiki: ").append(toIndentedString(hasWiki)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    forkPolicy: ").append(toIndentedString(forkPolicy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    hasIssues: ").append(toIndentedString(hasIssues)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

