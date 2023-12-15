package com.codersworld.configs;

import com.codersworld.configs.urls.tt.tt;

public class Tags {
    private static  String PREFS_NAME = "safelock_sdk";
    public static  String SB_ACCESS_TOKEN = "sl_tokenval";
    public static  String SB_USER_INFO = "Sl_user_info";
    public static  String SB_TT_KEY_LIST = "Sl_tt_key_list";
    public static  String SB_TT_ACCOUNT_INFO = "Sl_tt_account_info";




    /* ------- TTLOCK API URLS ---- */
    public static  String BASE_URL_TTLOCK = tt.getTTBaseUrl();//"https://euapi.ttlock.com";
    public static  String SB_API_TTLOCK_AUTH_TOKEN = tt.getTTAuthTokenLink();//"/oauth2/token";
    public static  String SB_API_TTLOCK_USER_KEYLIST =  tt.getTTUserKeyListLink();//"/v3/key/list";
    public static  String SB_API_TTLOCK_GATEWAY_LIST =  tt.getTTGatewayListLink();//"/v3/gateway/list";
    public static  String SB_API_TTLOCK_UPLOAD_DETAIL =  tt.getTTUploadDetailLink();//"/v3/gateway/uploadDetail";
    public static  String SB_API_TTLOCK_RENAME =  tt.getTTGatewayRenameLink();//"/v3/gateway/rename";
    public static  String SB_API_TTLOCK_RENAME_LOCK = tt.getTTLockRenameLink();// "/v3/lock/rename";
    public static  String SB_API_TTLOCK_INIT_SUCCESS =  tt.getTTInitSuccessLink();//"/v3/gateway/isInitSuccess";
    public static  String SB_API_TTLOCK_INIT =  tt.getTTLockInitLink();//"/v3/lock/initialize";
    public static  String SB_API_TTLOCK_UNLOCK_REMOTLY =  tt.getTTLockUnlockLink();//"/v3/lock/unlock";
    public static  String SB_API_LOCK_RECORDS_LIST = tt.getRecord();// "/v3/lockRecord/list";
    public static  String TT_CLIENT_ID =  tt.getTTLockClientId();//"439063e312444f1f85050a52efcecd2e";
    public static  String TT_CLIENT_SECRET = tt.getTTLockClientSecrete();// "0ef1c49b70c02ae6314bde603d4e9b05";



    /* ------- API URLS ---- */

    public static  String SERVER_MID_PATH = "vehicletrack.membocool.com";
    public static  String SERVER_MID_PATH_MMTHINKBIZ = "mmthinkbiz.com/MobileService.aspx";
    public static  String SERVER_SLASH = "/";
    public static  String BASE_URL_MEMBOCOOL = "https:" + SERVER_SLASH + SERVER_SLASH + SERVER_MID_PATH + SERVER_SLASH;

    public static  String BASE_URL_MMTHINKBIZ = "http:" + SERVER_SLASH + SERVER_SLASH + SERVER_MID_PATH_MMTHINKBIZ + SERVER_SLASH;


    public static  String SB_API_METHOD = "Safeobuddy.aspx?method=apss";
    public static  String SB_LOGIN_API = "method=LoginValidation1";
    public static  String SB_GET_ALL_V3_LOCKS = "method=GetV3lockdetail";//""Safeobuddy.aspx?method=apss";
    public static  String SB_UPDATE_LOCK_DATA = "method=UpdateLockData";//""Safeobuddy.aspx?method=apss";
    public static  String SB_UPDATE_LOCK_NAME = "method=UpdateLockName";//""Safeobuddy.aspx?method=apss";
    public static  String SB_DELETE_LOCK = "method=Insertunlocktimeaccessdetail";//""Safeobuddy.aspx?method=apss";
    public static  String SB_OPEN_LOCK = "method=StartStopVehicleOpenGate";//""Safeobuddy.aspx?method=apss";
    public static  String SB_UNLOCK_GATE_UPLOAD = "NewRegistration?method=Uploadgateunlock";//""Safeobuddy.aspx?method=apss";
    public static  String SB_API_SAVE_LOCK_STATUS = "method=SaveLockStatus";//""Safeobuddy.aspx?method=apss";
    public static  String SB_API_ADD_NEW_LOCK = "method=Add_Lock_New";//""Safeobuddy.aspx?method=apss";
    public static  String SB_API_CHECK_BLUETOOTH_ACCESS = "ConService.aspx?method=checkbothlockaccess";//""Safeobuddy.aspx?method=apss";
    public static  String SB_API_GET_GATE_RECORDS = "method=GetVehicle_Lock_Summary";//""Safeobuddy.aspx?method=apss";
    public static  String SB_WATCH_LIST_API= "ConService.aspx?method=GetV3lockdetail";
    public static  String SB_GET_ALL_V3_LOCKS1= "ConService.aspx?method=GetV3lockdetail";


    /* ---------------params --------------------*/
    public static  String P_VAL = "val";
    public static  String P_CAT = "cat";
    public static  String P_CID = "cid";
    public static  String P_CLIENT_ID = "client_id";
    public static  String P_CLIENT_SECRETE = "client_secret";
    public static  String P_USERNAME = "username";
    public static  String P_PASSWORD = "password";
    public static  String P_CLIENTID = "clientId";
    public static  String P_ACCESSTOKEN = "accessToken";
    public static  String P_PAGENO = "pageNo";
    public static  String P_PAGESIZE = "pageSize";
    public static  String P_DATE = "date";
    public static  String P_GATEWAYID = "gatewayId";
    public static  String P_MODELNUM = "modelNum";
    public static  String P_HARDWARE_REVISION = "hardwareRevision";
    public static  String P_FIRMWARE_REVISION = "firmwareRevision";
    public static  String P_NETWORK_NAME = "networkName";
    public static  String P_LOCK_ID = "lockId";
    public static  String P_LOCK_ALIAS = "lockAlias";
    public static  String P_GATEWAY_NET_MAC = "gatewayNetMac";
    public static  String P_LOCK_DATA = "lockData";
    public static  String P_START_DATE = "startDate";
    public static  String P_END_DATE = "endDate";
    public static  String P_CONTACT_ID = "contactid";





}
