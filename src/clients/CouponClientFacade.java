/**
 * 
 */
package clients;

import main.CouponException;

/**
 * @author Ofer
 *
 */
public interface CouponClientFacade {
	
	public CouponClientFacade login(String name, String Password) throws CouponException ;
	
}
