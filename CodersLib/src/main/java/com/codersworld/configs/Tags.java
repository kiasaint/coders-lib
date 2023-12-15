package com.codersworld.configs;

import com.codersworld.configs.urls.common.Constants;
import com.codersworld.configs.urls.mmthinkbiz.mmthinkbiz;
import com.codersworld.configs.urls.tt.tt;
import com.codersworld.configs.urls.vehicletrack.membocool;

public class Tags {
    private static final  String PREFS_NAME = "safelock_sdk";
    public static final String SB_ACCESS_TOKEN = "sl_tokenval";
    public static final String SB_USER_INFO = "Sl_user_info";
    public static final String SB_TT_KEY_LIST = "Sl_tt_key_list";
    public static final String SB_TT_ACCOUNT_INFO = "Sl_tt_account_info";


    /* ------- TTLOCK API URLS ---- */
    public static final String BASE_URL_TTLOCK = tt.getTTBaseUrl;
    public static final String SB_API_TTLOCK_AUTH_TOKEN = tt.getTTAuthTokenLink;
    public static final String SB_API_TTLOCK_USER_KEYLIST = tt.getTTUserKeyListLink;
    public static final String SB_API_TTLOCK_GATEWAY_LIST = tt.getTTGatewayListLink;
    public static final String SB_API_TTLOCK_UPLOAD_DETAIL = tt.getTTUploadDetailLink;
    public static final String SB_API_TTLOCK_RENAME = tt.getTTGatewayRenameLink;
    public static final String SB_API_TTLOCK_RENAME_LOCK = tt.getTTLockRenameLink;
    public static final String SB_API_TTLOCK_INIT_SUCCESS = tt.getTTInitSuccessLink;
    public static final String SB_API_TTLOCK_INIT = tt.getTTLockInitLink;
    public static final String SB_API_TTLOCK_UNLOCK_REMOTLY = tt.getTTLockUnlockLink;
    public static final String SB_API_LOCK_RECORDS_LIST = tt.getRecord;
    public static final String TT_CLIENT_ID = tt.getTTLockClientId;
    public static final String TT_CLIENT_SECRET = tt.getTTLockClientSecrete;



    /* ------- API URLS ---- */

    public static final String BASE_URL_MEMBOCOOL = membocool.getMembocoolBaseUrl;
    public static final String BASE_URL_MMTHINKBIZ =  mmthinkbiz.getMTBBaseUrl;

    public static final String SB_API_METHOD = membocool.getSafeobuddyApiMethod;
    public static final String SB_LOGIN_API = membocool.getLoginApiLink;
    public static final String SB_GET_ALL_V3_LOCKS = membocool.getAllV3LocksLink;
    public static final String SB_UPDATE_LOCK_DATA = membocool.getupdateLockDataLink;
    public static final String SB_UPDATE_LOCK_NAME = membocool.getupdateLockNameLink;
    public static final String SB_DELETE_LOCK = membocool.getDeleteLockLink;
    public static final String SB_OPEN_LOCK = membocool.getOpenLockLink;
    public static final String SB_UNLOCK_GATE_UPLOAD = membocool.getUploadUnlockGateLink;
    public static final String SB_API_SAVE_LOCK_STATUS = membocool.getSaveLockStatusLink;
    public static final String SB_API_ADD_NEW_LOCK = membocool.getAddNewLockLink;
    public static final String SB_API_CHECK_BLUETOOTH_ACCESS = membocool.getCheckBTAccessLink;
    public static final String SB_API_GET_GATE_RECORDS = membocool.getGateRecordsLink;


    /* ---------------params --------------------*/
    public static final String P_VAL = Constants.P_VAL;
    public static final String P_CAT = Constants.P_CAT;
    public static final String P_CID = Constants.P_CID;
    public static final String P_CLIENT_ID = Constants.P_CLIENT_ID;
    public static final String P_CLIENT_SECRETE = Constants.P_CLIENT_SECRETE;
    public static final String P_USERNAME = Constants.P_USERNAME;
    public static final String P_PASSWORD = Constants.P_PASSWORD;
    public static final String P_CLIENTID = Constants.P_CLIENTID;
    public static final String P_ACCESSTOKEN = Constants.P_ACCESSTOKEN;
    public static final String P_PAGENO = Constants.P_PAGENO;
    public static final String P_PAGESIZE = Constants.P_PAGESIZE;
    public static final String P_DATE = Constants.P_DATE;
    public static final String P_GATEWAYID = Constants.P_GATEWAYID;
    public static final String P_MODELNUM = Constants.P_MODELNUM;
    public static final String P_HARDWARE_REVISION = Constants.P_HARDWARE_REVISION;
    public static final String P_FIRMWARE_REVISION = Constants.P_FIRMWARE_REVISION;
    public static final String P_NETWORK_NAME = Constants.P_NETWORK_NAME;
    public static final String P_LOCK_ID = Constants.P_LOCK_ID;
    public static final String P_LOCK_ALIAS = Constants.P_LOCK_ALIAS;
    public static final String P_GATEWAY_NET_MAC = Constants.P_GATEWAY_NET_MAC;
    public static final String P_LOCK_DATA = Constants.P_LOCK_DATA;
    public static final String P_START_DATE = Constants.P_START_DATE;
    public static final String P_END_DATE = Constants.P_END_DATE;
    public static final String P_CONTACT_ID = Constants.P_CONTACT_ID;


}
