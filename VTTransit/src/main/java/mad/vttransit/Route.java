package mad.vttransit;


/**
 * A class for storing information about a specific route, identified by its
 * fullName and shortName
 *
 * @author Seth Nute (seth12)
 * @author Ben Kodres (bkobrien)
 * @author Joe Fletcher (joevt)
 * @version 11/8/13
 */
public class Route {
    private String fullName;
    private String shortName;


    /**
     * A constructor to initialize all of the fields, takes two params
     *
     * @param fullN  -> a String for the fullName of the route
     * @param shortN -> a String for the route's shortName (aka its code)
     */
    public Route(String fullN, String shortN) {
        fullName = fullN;
        shortName = shortN;
    }


    /**
     * A getter for the fullName field
     *
     * @return String -> the fullName field
     */
    public String getFullName() {
        return fullName;
    }


    /**
     * A getter for the shortName field (aka the route's code)
     *
     * @return String -> the shortName field
     */
    public String getShortName() {
        return shortName;
    }


    /**
     * Sets the route short name for a Route.
     *
     * @param shortN -> a string of the shortName for a Route
     */
    public void setShortName(String shortN) {
        shortName = shortN;
    }

}
