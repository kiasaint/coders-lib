package com.codersworld.configs.urls.tt;

import com.codersworld.configs.constants.a.a;
import com.codersworld.configs.constants.c.c;
import com.codersworld.configs.constants.e.e;
import com.codersworld.configs.constants.h.h;
import com.codersworld.configs.constants.i.i;
import com.codersworld.configs.constants.k.k;
import com.codersworld.configs.constants.n.n;
import com.codersworld.configs.constants.numbers.numbers;
import com.codersworld.configs.constants.o.o;
import com.codersworld.configs.constants.p.p;
import com.codersworld.configs.constants.t.t;
import com.codersworld.configs.constants.u.u;
import com.codersworld.configs.constants.symbols.symbols;
import com.codersworld.configs.urls.common.common;

public class tt extends common {
    //https://euapi.ttlock.com
    public static String getTTBaseUrl = getHttps + e.e + u.u +a.a+ p.p+ i.i+ symbols.dots + t.t + t.t + getlock + getDotCom;

    public static String getTTAuthTokenLink = symbols.b_slash + o.o + a.a + u.u + t.t + h.h + numbers.TWO + symbols.b_slash + t.t + o.o + c.c + k.k + e.e + n.n;

    public static String getTTUserKeyListLink = symbols.b_slash + getv3 + symbols.b_slash + getkey + symbols.b_slash + getlist;

    public static String getTTGatewayListLink = symbols.b_slash + getv3 + symbols.b_slash + getgateway + symbols.b_slash + getlist;

    public static String getTTUploadDetailLink = symbols.b_slash + getv3 + symbols.b_slash + getgateway + symbols.b_slash + getUpload + getDetail;

    public static String getTTGatewayRenameLink = symbols.b_slash + getv3 + symbols.b_slash + getgateway + symbols.b_slash + getrename;

    public static String getTTLockRenameLink = symbols.b_slash + getv3 + symbols.b_slash + getlock + symbols.b_slash + getrename;

    public static String getTTInitSuccessLink = symbols.b_slash + getv3 + symbols.b_slash + getgateway + symbols.b_slash + getisInitSuccess;

    public static String getTTLockInitLink = symbols.b_slash + getv3 + symbols.b_slash + getlock + symbols.b_slash + getinitialize;

    public static String getTTLockUnlockLink = symbols.b_slash + getv3 + symbols.b_slash + getlock + symbols.b_slash + getunlock;

    public static String getTTLockRecordListLink = symbols.b_slash + getv3 + symbols.b_slash + getlock + getRecord + symbols.b_slash + getlist;

    public static String getTTLockClientId = getTTClientId;

    public static String getTTLockClientSecrete = getTTClientSecrete;

}
