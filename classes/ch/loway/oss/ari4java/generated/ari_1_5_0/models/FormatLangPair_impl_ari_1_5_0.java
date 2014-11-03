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
 * Identifies the format and language of a sound file
 * 
 * Defined in file: sounds.json
 *********************************************************/

public class FormatLangPair_impl_ari_1_5_0 implements FormatLangPair, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private String format;
 public String getFormat() {
   return format;
 }

 @JsonDeserialize( as=String.class )
 public void setFormat(String val ) {
   format = val;
 }

  /**    */
  private String language;
 public String getLanguage() {
   return language;
 }

 @JsonDeserialize( as=String.class )
 public void setLanguage(String val ) {
   language = val;
 }

/** No missing signatures from interface */
}
