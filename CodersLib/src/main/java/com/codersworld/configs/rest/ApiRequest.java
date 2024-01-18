package com.codersworld.configs.rest;



import com.codersworld.configs.urls.common.Constants;
import com.codersworld.configs.urls.common.Links;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface ApiRequest {

    @POST(Links.SB_API_METHOD)
    @FormUrlEncoded
    Call<String> makeLogin(@Field(Constants.P_VAL) String params);

    @POST(Links.SB_API_METHOD)
    @FormUrlEncoded
    Call<String> getAllV3Locks(@Field(Constants.P_VAL) String params);

    @POST(Links.SB_GET_ALL_V3_LOCKS)
    @FormUrlEncoded
    Call<String> getAllV3Locks1(@Query(Constants.P_CAT) String cat, @Field(Constants.P_CID) String cid);

    @POST(Links.SB_API_METHOD)
    @FormUrlEncoded
    Call<String> updateLockData(@Field(Constants.P_VAL) String params);

    @POST(Links.SB_API_METHOD)
    @FormUrlEncoded
    Call<String> updateLockName(@Field(Constants.P_VAL) String params);

    @POST(Links.SB_API_METHOD)
    @FormUrlEncoded
    Call<String> deleteLock(@Field(Constants.P_VAL) String params);

    @POST(Links.SB_API_METHOD)
    @FormUrlEncoded
    Call<String> saveArmMode(@Field(Constants.P_VAL) String params);

    @POST(Links.SB_API_METHOD)
    @FormUrlEncoded
    Call<String> uploadGeneratedOTP(@Field(Constants.P_VAL) String params);

    /*  ttlock */
    @POST(Links.SB_API_TTLOCK_AUTH_TOKEN)
    @FormUrlEncoded
    Call<String> ttlockAuth(@Field(Constants.P_CLIENT_ID) String clientId, @Field(Constants.P_CLIENT_SECRETE) String clientSecret, @Field(Constants.P_USERNAME) String username, @Field(Constants.P_PASSWORD) String password);

    @POST(Links.SB_API_TTLOCK_GET_LOCKDATA)
    @FormUrlEncoded
    Call<String> getLockData(@Field(Constants.P_CLIENT_ID) String clientId,
                             @Field(Constants.P_ACCESSTOKEN) String accessToken,
                             @Field(Constants.P_LOCK_ID) String lockId,
                             @Field(Constants.P_DATE) String date
    );
//l.l+o.o+c.c+k.kId
    @GET(Links.SB_API_TTLOCK_USER_KEYLIST)
    Call<ResponseBody> getUserKeyList(@QueryMap Map<String, String> params);

    @POST(Links.SB_API_TTLOCK_GATEWAY_LIST)
    @FormUrlEncoded
    Call<String> getGatewayList(@Field(Constants.P_CLIENTID) String clientId,
                                @Field(Constants.P_ACCESSTOKEN) String accessToken,
                                @Field(Constants.P_PAGENO) String pageNo,
                                @Field(Constants.P_PAGESIZE) String pageSize,
                                @Field(Constants.P_DATE) String date
    );


    @POST(Links.SB_API_TTLOCK_UPLOAD_DETAIL)
    @FormUrlEncoded
    Call<String> uploadGatewayDetail(@Field(Constants.P_CLIENTID) String clientId,
                                     @Field(Constants.P_ACCESSTOKEN) String accessToken,
                                     @Field(Constants.P_GATEWAYID) String gatewayId,
                                     @Field(Constants.P_MODELNUM) String modelNum,
                                     @Field(Constants.P_HARDWARE_REVISION) String hardwareRevision,
                                     @Field(Constants.P_FIRMWARE_REVISION) String firmwareRevision,
                                     @Field(Constants.P_NETWORK_NAME) String networkName,
                                     @Field(Constants.P_DATE) String date
    );

    @POST(Links.SB_API_TTLOCK_RENAME)
    @FormUrlEncoded
    Call<String> renameGateway(@Field(Constants.P_CLIENTID) String clientId,
                               @Field(Constants.P_ACCESSTOKEN) String accessToken,
                               @Field(Constants.P_GATEWAYID) String gatewayId,
                               @Field(Constants.P_MODELNUM) String modelNum,
                               @Field(Constants.P_HARDWARE_REVISION) String hardwareRevision,
                               @Field(Constants.P_FIRMWARE_REVISION) String firmwareRevision,
                               @Field(Constants.P_NETWORK_NAME) String networkName,
                               @Field(Constants.P_DATE) String date
    );

    @POST(Links.SB_API_TTLOCK_RENAME_LOCK)
    @FormUrlEncoded
    Call<String> renameTTLock(@Field(Constants.P_CLIENTID) String clientId,
                              @Field(Constants.P_ACCESSTOKEN) String accessToken,
                              @Field(Constants.P_LOCK_ALIAS) String lockAlias,
                              @Field(Constants.P_DATE) String date,
                              @Field(Constants.P_LOCK_ID) String lockId
    );

    @POST(Links.SB_API_TTLOCK_INIT_SUCCESS)
    @FormUrlEncoded
    Call<String> gatewayIsInitSuccess(@Field(Constants.P_CLIENTID) String clientId,
                                      @Field(Constants.P_ACCESSTOKEN) String accessToken,
                                      @Field(Constants.P_GATEWAY_NET_MAC) String gatewayNetMac,
                                      @Field(Constants.P_DATE) String date
    );

    @POST(Links.SB_API_TTLOCK_INIT)
    @FormUrlEncoded
    Call<String> iniTTLock(@Field(Constants.P_CLIENTID) String clientId,
                           @Field(Constants.P_ACCESSTOKEN) String accessToken,
                           @Field(Constants.P_LOCK_DATA) String gatewayNetMac,
                           @Field(Constants.P_LOCK_ALIAS) String lockAlias,
                           @Field(Constants.P_DATE) String date
    );

    @POST(Links.SB_API_LOCK_RECORDS_LIST)
    @FormUrlEncoded
    Call<String> getLockRecords(@Field(Constants.P_CLIENTID) String clientId,
                                @Field(Constants.P_ACCESSTOKEN) String accessToken,
                                @Field(Constants.P_PAGENO) String pageNo,
                                @Field(Constants.P_DATE) String date,
                                @Field(Constants.P_LOCK_ID) String lockId,
                                @Field(Constants.P_START_DATE) String startDate,
                                @Field(Constants.P_END_DATE) String endDate
    );

    @POST(Links.SB_API_TTLOCK_UNLOCK_REMOTLY)
    @FormUrlEncoded
    Call<String> remotlyUnlockDevice(@Field(Constants.P_CLIENTID) String clientId,
                                     @Field(Constants.P_ACCESSTOKEN) String accessToken,
                                     @Field(Constants.P_DATE) String date,
                                     @Field(Constants.P_LOCK_ID) String lockId
    );

    @POST(Links.SB_UNLOCK_GATE_UPLOAD)
    @FormUrlEncoded
    Call<String> unlockPendingGates(@FieldMap Map<String, String> mParams);

    @POST(Links.SB_API_METHOD)
    @FormUrlEncoded
    Call<String> saveLockStatus(@Field(Constants.P_VAL) String val);

    @POST(Links.SB_API_METHOD)
    @FormUrlEncoded
    Call<String> addLocksToServer(@Field(Constants.P_VAL) String val);

    @POST(Links.SB_API_METHOD)
    @FormUrlEncoded
    Call<String> gateUnlock(@Field(Constants.P_VAL) String val);

    @POST(Links.SB_API_METHOD)
    @FormUrlEncoded
    Call<String> getGateRecords(@Field(Constants.P_VAL) String val);

    @POST(Links.SB_API_METHOD)
    @FormUrlEncoded
    Call<String> getAllVehicles(@Field(Constants.P_VAL) String val);

    @POST(Links.SB_API_METHOD)
    @FormUrlEncoded
    Call<String> getAllVehiclesData(@Field(Constants.P_VAL) String val);

    @GET(Links.SB_API_CHECK_BLUETOOTH_ACCESS)
    Call<String> checkBluetoothAccess(@Query(Constants.P_CONTACT_ID) String contactid);

    @GET(Links.SB_API_GET_DEVICE_INFO)////lockid,contactid,token
    Call<String> getDeviceInfo(@Query(Constants.P_LOCK_ID_SMALL) String lockid,@Query(Constants.P_CONTACT_ID) String contactid,@Query(Constants.P_TOKEN) String token);
    @GET(Links.SB_API_GET_GATE_RECORDS_DATA)
    Call<String> getGateRecordsData(@Query("FromDate") String FromDate,@Query("ToDate") String ToDate,@Query("VehicleNumber") String VehicleNumber,@Query("DeviceId") String DeviceId,@Query("contactid") String contactid,@Query("type") String type,@Query("val1") String val1,@Query("val2") String val2);
    @GET(Links.SB_API_SAVE_LOCK_STATUS_DATA)
    Call<String> saveGateRecords(@Query("Createdby") String Createdby,@Query("LockID") String LockID,@Query("LoginUserName") String LoginUserName,@Query("Status") String Status,@Query("type") String type,@Query("LockName") String LockName,@Query("type1") String type1);
}
