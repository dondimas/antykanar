//package nl.ideazone.wordweb.test_utils;
//
//import com.taptera.sunbelt.api_communication.IApiRequester;
//import com.taptera.sunbelt.model.SBEquipmentAction;
//import com.taptera.sunbelt.model.SBJobsite;
//import com.taptera.sunbelt.model.SBReservationAction;
//import com.taptera.sunbelt.model.SBReservationPost;
//import com.taptera.sunbelt.tests.utils.RobolectricUtils;
//import com.taptera.sunbelt.utils.network.response.RestResponse;
//
//import java.io.InputStream;
//import java.io.UnsupportedEncodingException;
//
///**
// * Created with IntelliJ IDEA.
// * User: dmitri
// * Date: 11/14/12
// * Time: 4:37 PM
// */
//public class FakedFileBasedApiRequester implements IApiRequester {
//
//    private String CATEGORIES_FILE_PATH = "json/categories_prod.json";
//    private String SUB_CATEGORIES_FILE_PATH = "json/categories_prod_1226.json";
//    private String LOCATIONS_FILE_PATH = "json/location_prod.json";
//    private String LOCATIONS_DETAILS_FILE_PATH = "json/location_details.json";
//    private String EQUIPMENT_QUICK_SEARCH_FILE_PATH = "json/equipment_quick_search.json";
//    private String EQUIPMENT_WEBCAT_ID_FILE_PATH = "json/equipment_web_cat_id.json";
//    private String EQUIPMENT_DETAILS_FILE_PATH = "json/equipment_with_details.json";
//    private String EQUIPMENT_FROM_JOBSITE_FILE_PATH = "json/equipment_from_jobsite.json";
//    private String RENTED_EQUIPMENT_FILE_PATH = "json/rented_equipment.json";
//    private String ACCOUNT_RESERVATIONS_FILE_PATH = "json/account_reservations.json";
//    private String RENTAL_PACKAGE_FILE_PATH = "json/rental_package.json";
//    private String WEB_USER_FILE_PATH = "json/web_user.json";
//    private String CASH_USER_FILE_PATH = "json/cash_user.json";
//    private String CASH_USER_JOB_SITE = "json/cash_user_job_site.json";
//    private String OPEN_INVOICES_FILE_PATH = "json/open_invoices.json";
//    private String JOB_SITES_FILE_PATH = "json/job_sites_adapter_build_issues.json";
//
//    private RobolectricUtils utils = new RobolectricUtils();
//
//    //    @Override
////    public String getAllCategoriesJSONString() throws IOException {
////        RobolectricUtils utils = new RobolectricUtils();
////        String categoriesData =utils.getFileToString(CATEGORIES_FILE_PATH);
////
////        return categoriesData;
////    }
//
//    //   curl -H "Accept: application/json" https://qasws.sunbeltrentals.com/api/location?state=NC
//
//
//    // from top lewel categories to equipment list
////    curl -H "Accept: application/json" https://qasws.sunbeltrentals.com/api/eqpcat
////    curl -H "Accept: application/json" https://qasws.sunbeltrentals.com/api/eqpcat/1226
////    curl -H "Accept: application/json" https://qasws.sunbeltrentals.com/api/eqpclass?catId=13
//
//    //equipment details
//
////    curl -H "Accept: application/json" https://qasws.sunbeltrentals.com/api/equipment?webCatId=s374&catId=60&classId=420
////    curl -H "Accept: application/json" https://qasws.sunbeltrentals.com/api/equipment?token=asd&account=1
//
//
////    curl -H "Accept: application/json" https://qasws.sunbeltrentals.com/api/equipment?webCatId=s374&catId=60&classId=410
//
//    // rented equipment
////    curl -H "Accept: application/json" https://qasws.sunbeltrentals.com/api/equipment?account=4&token=1e2ccf8d-4123-49a9-9729-d5ba3c7611b9&isCorpLink=false&jobNumber=1+-+BARRY+STEAM+PLAN
//
//    @Override
//    public RestResponse<InputStream> getAllCategoriesJSONStream() {
//        return new RestResponse<InputStream>(utils.getStreamingJson(CATEGORIES_FILE_PATH));
//
//    }
//
//    @Override
//    public RestResponse<InputStream> getCashUserJobSite(String token, String dlNumber, String dlState) {
//        return new RestResponse<InputStream>(utils.getStreamingJson(CASH_USER_JOB_SITE));
//    }
//
//    @Override
//    public RestResponse<InputStream> getSubCategoriesJSONStream(int webCatId) {
//        return new RestResponse<InputStream>(utils.getStreamingJson(SUB_CATEGORIES_FILE_PATH));
//    }
//
//    @Override
//    public RestResponse<InputStream> getAllLocationsJSONStream() {
//        return new RestResponse<InputStream>(utils.getStreamingJson(LOCATIONS_FILE_PATH));
//    }
//
//    @Override
//    public RestResponse<InputStream> getLocationDetailsJSONStream(int locationId) {
//        return new RestResponse<InputStream>(utils.getStreamingJson(LOCATIONS_DETAILS_FILE_PATH));
//    }
//
//    @Override
//    public RestResponse<InputStream> getEquipmentsJSONStreamFromWebCatId(int webCatId) {
//        return new RestResponse<InputStream>(utils.getStreamingJson(EQUIPMENT_WEBCAT_ID_FILE_PATH));
//    }
//
//    @Override
//    public RestResponse<InputStream> getEquipmentsJSONStreamFromQuickSearch(String quickSearch) {
//        return new RestResponse<InputStream>(utils.getStreamingJson(EQUIPMENT_QUICK_SEARCH_FILE_PATH));
//    }
//
//    @Override
//    public RestResponse<InputStream> getCustomerForToken(String token) {
//        return new RestResponse<InputStream>(utils.getStreamingJson(WEB_USER_FILE_PATH));
//    }
//
//    @Override
//    public RestResponse<InputStream> getCustomerAndLogin(String email, String password) {
//        if (email.compareTo("p@taptera.com") == 0) {
//            return new RestResponse<InputStream>(utils.getStreamingJson(WEB_USER_FILE_PATH));
//        } else {
//            return new RestResponse<InputStream>(utils.getStreamingJson(CASH_USER_FILE_PATH));
//        }
//
//    }
//
//    @Override
//    public RestResponse<InputStream> createCustomer(String webUserJson) throws UnsupportedEncodingException {
//        return null;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    @Override
//    public RestResponse<InputStream> updateCustomer(String token, String webUserJson) throws UnsupportedEncodingException {
//        return null;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    /**
//     * Returns JSON stream of all active job sites for the account.
//     *
//     * @param token
//     * @param account
//     * @return
//     * @throws java.io.IOException
//     */
//    @Override
//    public RestResponse<InputStream> getActiveJobSitesJSONStream(String token, int account, boolean isCorpLink, boolean isStrategic) {
//        return new RestResponse<InputStream>(utils.getStreamingJson(JOB_SITES_FILE_PATH));
//    }
//
//    @Override
//    public RestResponse<InputStream> getEquipmentRatesJSONStream(int webCatId, int catId, int classId, Integer account, int pc) {
//        return null;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    @Override
//    public RestResponse<InputStream> getOpenInvoicesJSONStream(String token, int account, Boolean isCorpLink) {
//        return new RestResponse<InputStream>(utils.getStreamingJson(OPEN_INVOICES_FILE_PATH));
//    }
//
//    @Override
//    public String getInvoicePdfUrl(String token, int number, Integer sequence, Integer account, Boolean isCorpLink) throws UnsupportedEncodingException {
//        return null;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    @Override
//    public RestResponse<InputStream> postReservation(String token, SBReservationPost reservationPost) {
//        return null;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    @Override
//    public RestResponse<InputStream> createJobsite(String token, SBJobsite jobsite) throws UnsupportedEncodingException {
//        return null;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    @Override
//    public RestResponse<InputStream> updateJobsite(String token, SBJobsite jobsite) throws UnsupportedEncodingException {
//        return null;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    @Override
//    public RestResponse<InputStream> getLocationByCoordinates(double latitude, double longitude) throws UnsupportedEncodingException {
//        return null;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    @Override
//    public RestResponse<InputStream> getLocationByZIP(String zip) throws UnsupportedEncodingException {
//        return new RestResponse<InputStream>(utils.getStreamingJson(LOCATIONS_DETAILS_FILE_PATH));
//    }
//
//    @Override
//    public RestResponse<InputStream> getReservationsJSONStream(String token, int account, boolean isCorpLink) {
//        return new RestResponse<InputStream>(utils.getStreamingJson(ACCOUNT_RESERVATIONS_FILE_PATH));
//    }
//
//    @Override
//    public RestResponse<InputStream> getReservationsCashJSONStream(String token, String dlNumber, String dlState) {
//        return null;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    @Override
//    public RestResponse<InputStream> getReservationDetailsJSONStream(String token, int account, int contract) {
//        return null;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    @Override
//    public RestResponse<InputStream> getReservationCashDetailsJSONStream(String token, String dlNumber, String dlState, int contract) {
//        return null;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    @Override
//    public RestResponse<InputStream> putReservationAction(String token, SBReservationAction reservationAction) throws UnsupportedEncodingException {
//        return null;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    @Override
//    public RestResponse<InputStream> getAllCategoriesWithMyGear(int account) {
//        return null;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    @Override
//    public RestResponse<InputStream> getSubCategoriesWithMyGear(int webCatId, int account) {
//        return null;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    @Override
//    public RestResponse<InputStream> getMyGearEquipmentsJSONStreamFromWebCatId(String currentUserToken, int account, Integer webCatId) {
//        return null;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    @Override
//    public RestResponse<InputStream> postEquipmentAction(String token, SBEquipmentAction equipmentAction) {
//        return null;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    @Override
//    public RestResponse<InputStream> getRentalPackage(String token, int account ) {
//        return new RestResponse<InputStream>(utils.getStreamingJson(RENTAL_PACKAGE_FILE_PATH));
//    }
//
//    @Override
//    public RestResponse<InputStream> getRentalPackageForType(String token, int account, String type) {
//        return new RestResponse<InputStream>(utils.getStreamingJson(RENTAL_PACKAGE_FILE_PATH));
//    }
//
//    @Override
//    public RestResponse<InputStream> getEquipmentsStreamForAccount(String token, int account, Boolean isCorpLink) {
//        return null;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    @Override
//    public RestResponse<InputStream> getEquipmentsJSONStreamForCashUser(String token, String dlNumber, String dlState) {
//        return null;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    @Override
//    public RestResponse<InputStream> getEquipmentJSONStreamWithDetails(int webCatId, int catId, int classId) {
//        return new RestResponse<InputStream>(utils.getStreamingJson(EQUIPMENT_DETAILS_FILE_PATH));
//    }
//
//    @Override
//    public RestResponse<InputStream> getEquipmentsFromJobSiteJSONStream(String token, int account, String jobNumber, Boolean isCorpLink) {
//        return new RestResponse<InputStream>(utils.getStreamingJson(EQUIPMENT_FROM_JOBSITE_FILE_PATH));  //To change body of implemented methods use File | Settings | File Templates.
//    }
//}
