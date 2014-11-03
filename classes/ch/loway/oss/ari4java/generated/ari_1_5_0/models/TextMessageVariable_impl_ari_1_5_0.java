package ch.loway.oss.ari4java.generated.ari_1_5_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sun Nov 02 19:48:30 CET 2014
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * A key/value pair variable in a text message.
 * 
 * Defined in file: endpoints.json
 *********************************************************/

public class TextMessageVariable_impl_ari_1_5_0 implements TextMessageVariable, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  A unique key identifying the variable.  */
  private String key;
 public String getKey() {
   return key;
 }

 @JsonDeserialize( as=String.class )
 public void setKey(String val ) {
   key = val;
 }

  /**  The value of the variable.  */
  private String value;
 public String getValue() {
   return value;
 }

 @JsonDeserialize( as=String.class )
 public void setValue(String val ) {
   value = val;
 }

/** No missing signatures from interface */
}
