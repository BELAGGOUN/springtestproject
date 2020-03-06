package io.swagger.api;

import io.swagger.model.InlineResponse500;
import io.swagger.model.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-06T00:52:27.046Z[GMT]")
@Controller
public class PersonApiController implements PersonApi {

    private static final Logger log = LoggerFactory.getLogger(PersonApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PersonApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Person>> personGet(@ApiParam(value = "Page number to return") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber
, @Max(100) @ApiParam(value = "Number of result in the page", allowableValues = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Person>>(objectMapper.readValue("[ {\n  \"firstName\" : \"John\",\n  \"lastName\" : \"Doe\",\n  \"nId\" : 4,\n  \"dateBirth\" : \"{}\",\n  \"age\" : 28\n}, {\n  \"firstName\" : \"John\",\n  \"lastName\" : \"Doe\",\n  \"nId\" : 4,\n  \"dateBirth\" : \"{}\",\n  \"age\" : 28\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Person>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Person>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Person> personPersonIdGet(@ApiParam(value = "",required=true) @PathVariable("personId") Integer personId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Person>(objectMapper.readValue("{\n  \"firstName\" : \"John\",\n  \"lastName\" : \"Doe\",\n  \"nId\" : 4,\n  \"dateBirth\" : \"{}\",\n  \"age\" : 28\n}", Person.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Person>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Person>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> personPost(@ApiParam(value = ""  )  @Valid @RequestBody Person body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
