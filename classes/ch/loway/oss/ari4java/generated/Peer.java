package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Tue Dec 19 09:55:48 CET 2017
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.tags.*;

/**********************************************************
 * 
 * Generated by: JavaInterface
 *********************************************************/


public interface Peer {

// String getCause
/**********************************************************
 * An optional reason associated with the change in peer_status.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public String getCause();



// String getPeer_status
/**********************************************************
 * The current state of the peer. Note that the values of the status are dependent on the underlying peer technology.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public String getPeer_status();



// String getTime
/**********************************************************
 * The last known time the peer was contacted.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public String getTime();



// String getAddress
/**********************************************************
 * The IP address of the peer.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public String getAddress();



// void setAddress String
/**********************************************************
 * The IP address of the peer.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setAddress(String val );



// String getPort
/**********************************************************
 * The port of the peer.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public String getPort();



// void setPeer_status String
/**********************************************************
 * The current state of the peer. Note that the values of the status are dependent on the underlying peer technology.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setPeer_status(String val );



// void setPort String
/**********************************************************
 * The port of the peer.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setPort(String val );



// void setTime String
/**********************************************************
 * The last known time the peer was contacted.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setTime(String val );



// void setCause String
/**********************************************************
 * An optional reason associated with the change in peer_status.
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setCause(String val );


}
;
