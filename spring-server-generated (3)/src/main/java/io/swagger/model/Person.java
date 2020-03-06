package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Person
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-06T00:52:27.046Z[GMT]")
public class Person   {
  @JsonProperty("nId")
  private Integer nId = null;

  @JsonProperty("age")
  private Integer age = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("dateBirth")
  private String dateBirth = null;

  public Person nId(Integer nId) {
    this.nId = nId;
    return this;
  }

  /**
   * Get nId
   * @return nId
  **/
  @ApiModelProperty(example = "4", required = true, value = "")
      @NotNull

    public Integer getNId() {
    return nId;
  }

  public void setNId(Integer nId) {
    this.nId = nId;
  }

  public Person age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  **/
  @ApiModelProperty(example = "28", value = "")
  
    public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Person firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "John", value = "")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Person lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "Doe", value = "")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Person dateBirth(String dateBirth) {
    this.dateBirth = dateBirth;
    return this;
  }

  /**
   * Get dateBirth
   * @return dateBirth
  **/
  @ApiModelProperty(example = "{}", value = "")
  
    public String getDateBirth() {
    return dateBirth;
  }

  public void setDateBirth(String dateBirth) {
    this.dateBirth = dateBirth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(this.nId, person.nId) &&
        Objects.equals(this.age, person.age) &&
        Objects.equals(this.firstName, person.firstName) &&
        Objects.equals(this.lastName, person.lastName) &&
        Objects.equals(this.dateBirth, person.dateBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nId, age, firstName, lastName, dateBirth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    nId: ").append(toIndentedString(nId)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateBirth: ").append(toIndentedString(dateBirth)).append("\n");
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
