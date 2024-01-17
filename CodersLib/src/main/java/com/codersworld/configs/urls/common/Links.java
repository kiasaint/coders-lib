package com.codersworld.configs.urls.common;


 import com.codersworld.configs.constants.a.a;
import com.codersworld.configs.constants.b.b;
import com.codersworld.configs.constants.c.c;
import com.codersworld.configs.constants.d.d;
import com.codersworld.configs.constants.e.e;
import com.codersworld.configs.constants.f.f;
import com.codersworld.configs.constants.g.g;
import com.codersworld.configs.constants.h.h;
import com.codersworld.configs.constants.i.i;
import com.codersworld.configs.constants.k.k;
import com.codersworld.configs.constants.l.l;
import com.codersworld.configs.constants.m.m;
import com.codersworld.configs.constants.n.n;
import com.codersworld.configs.constants.numbers.numbers;
import com.codersworld.configs.constants.o.o;
import com.codersworld.configs.constants.p.p;
import com.codersworld.configs.constants.r.r;
import com.codersworld.configs.constants.s.s;
import com.codersworld.configs.constants.symbols.symbols;
import com.codersworld.configs.constants.t.t;
import com.codersworld.configs.constants.u.u;
import com.codersworld.configs.constants.v.v;
import com.codersworld.configs.constants.w.w;
import com.codersworld.configs.constants.x.x;
import com.codersworld.configs.constants.y.y;
import com.codersworld.configs.constants.z.z;
import com.codersworld.configs.urls.mmthinkbiz.mmthinkbiz;
import com.codersworld.configs.urls.tt.tt;
import com.codersworld.configs.urls.vehicletrack.membocool;

public class Links extends membocool {
    private static String PREFS_NAME = "safelock_sdk";
    public static final String SB_ACCESS_TOKEN = "sl_tokenval";
    public static final String SB_USER_INFO = "Sl_user_info";
    public static final String SB_TT_KEY_LIST = "Sl_tt_key_list";
    public static final String SB_TT_ACCOUNT_INFO = "Sl_tt_account_info";


    /* ------- TTLOCK API URLS ---- *///"/v3/key/get"
    public static final String BASE_URL_TTLOCK = tt.getTTBaseUrl;
    public static final String BASE_URL_TTLOCK1 = tt.getTTBaseUrl1;
     public static final String SB_API_TTLOCK_AUTH_TOKEN = symbols.b_slash + o.o + a.a + u.u + t.t + h.h + numbers.TWO + symbols.b_slash + t.t + o.o + k.k + e.e + n.n;
     public static final String SB_API_TTLOCK_USER_KEYLIST = symbols.b_slash + v.v + numbers.THREE + symbols.b_slash + k.k + e.e + y.y + symbols.b_slash + l.l + i.i + s.s + t.t;
     public static final String SB_API_TTLOCK_GET_LOCKDATA = symbols.b_slash + v.v + numbers.THREE + symbols.b_slash + k.k + e.e + y.y + symbols.b_slash + g.g+e.e+t.t;

    public static final String SB_API_TTLOCK_GATEWAY_LIST =  symbols.b_slash + v.v + numbers.THREE + symbols.b_slash + g.g + a.a + t.t + e.e + w.w + a.a + y.y + symbols.b_slash + l.l + i.i + s.s + t.t;

    public static final String SB_API_TTLOCK_UPLOAD_DETAIL = symbols.b_slash + v.v + numbers.THREE + symbols.b_slash + g.g + a.a + t.t + e.e + w.w + a.a + y.y + symbols.b_slash + u.u + p.p + l.l + o.o + a.a + d.d + d.D + e.e + t.t + a.a + i.i + l.l;

    public static final String SB_API_TTLOCK_RENAME = symbols.b_slash + v.v + numbers.THREE + symbols.b_slash + g.g + a.a + t.t + e.e + w.w + a.a + y.y + symbols.b_slash + r.r + e.e + n.n + a.a + m.m + e.e;

    public static final String SB_API_TTLOCK_RENAME_LOCK =  symbols.b_slash + v.v + numbers.THREE + symbols.b_slash + g.g + a.a + t.t + e.e + w.w + a.a + y.y + symbols.b_slash + r.r + e.e + n.n + a.a + m.m + e.e;

    public static final String SB_API_TTLOCK_INIT_SUCCESS = symbols.b_slash + v.v + numbers.THREE + symbols.b_slash + g.g + a.a + t.t + e.e + w.w + a.a + y.y + symbols.b_slash + u.u + s.s + i.I + n.n + i.i + t.t + s.S + u.u + c.c + c.c + e.e + s.s + s.s;

    public static final String SB_API_TTLOCK_INIT = symbols.b_slash + v.v + numbers.THREE + symbols.b_slash + l.l + o.o + c.c + k.k + symbols.b_slash + i.i + n.n + i.i + t.t + i.i + a.a + l.l + i.i + z.z + e.e;

    public static final String SB_API_TTLOCK_UNLOCK_REMOTLY = symbols.b_slash + v.v + numbers.THREE + symbols.b_slash + l.l + o.o + c.c + k.k + symbols.b_slash + u.u + n.n + l.l + o.o + c.c + k.k;

    public static final String SB_API_LOCK_RECORDS_LIST = symbols.b_slash + v.v + numbers.THREE + symbols.b_slash + l.l + o.o + c.c + k.k + r.R + e.e + c.c + o.o + r.r + d.d + symbols.b_slash + l.l + i.i + s.s + t.t;

    public static final String TT_CLIENT_ID = tt.getTTLockClientId;
    public static final String TT_CLIENT_SECRET = tt.getTTLockClientSecrete;





    /* ------- API URLS ---- */

    public static final String BASE_URL_MEMBOCOOL = membocool.getMembocoolBaseUrl;
    public static final String BASE_URL_MMTHINKBIZ =  mmthinkbiz.getMTBBaseUrl;

 
    public static final String SB_API_METHOD = s.S + a.a + f.f + e.e + o.o + b.b + u.u + d.d + d.d + y.y + symbols.dots+a.a+s.s+p.p+ x.x + symbols.question + m.m+e.e+t.t+h.h+o.o+d.d+symbols.equal + a.a + p.p + s.s + s.s;
    public static final String SB_LOGIN_API = m.m+e.e+t.t+h.h+o.o+d.d+symbols.equal + l.L + o.o + g.g + i.i + n.n + v.V + a.a + l.l + i.i + d.d + a.a + t.t + i.i + o.o + n.n + numbers.ONE;

    public static final String SB_GET_ALL_V3_LOCKS =  m.m+e.e+t.t+h.h+o.o+d.d+symbols.equal + g.G + e.e + t.t + v.V + numbers.THREE + l.l + o.o + c.c + k.k + d.d + e.e + t.t + a.a + i.i + l.l;
    public static final String SB_UPDATE_LOCK_DATA = m.m+e.e+t.t+h.h+o.o+d.d+symbols.equal + u.U+p.p+d.d+a.a+t.t+e.e + l.L+o.o+c.c+k.k + d.D + a.a + t.t + a.a;
    public static final String SB_UPDATE_LOCK_DATA_CHILD = m.m+e.e+t.t+h.h+o.o+d.d+symbols.equal + u.U+p.p+d.d+a.a+t.t+e.e + l.L+o.o+c.c+k.k + d.D + a.a + t.t + a.a+c.c+h.h+i.i+l.l+d.d;
    public static final String SB_UPDATE_LOCK_NAME = m.m+e.e+t.t+h.h+o.o+d.d+symbols.equal + u.U+p.p+d.d+a.a+t.t+e.e + l.L+o.o+c.c+k.k + n.N + a.a + m.m + e.e;
    public static final String SB_DELETE_LOCK =m.m+e.e+t.t+h.h+o.o+d.d+symbols.equal + i.I+n.n+s.s+e.e+r.r+t.t + u.u + n.n + l.l + o.o + c.c + k.k + t.t + i.i + m.m + e.e + a.a + c.c + c.c + e.e + s.s + s.s + d.d + e.e + t.t + a.a + i.i + l.l;

    public static final String SB_OPEN_LOCK = m.m+e.e+t.t+h.h+o.o+d.d+symbols.equal + i.I+n.n+s.s+e.e+r.r+t.t + s.S + t.t + a.a + r.r + t.t + s.S + t.t + o.o + p.p + v.V + e.e + h.h + i.i + c.c + l.l + e.e + o.O + p.p + e.e + n.n + g.G + a.a + t.t + e.e;

    public static final String SB_UNLOCK_GATE_UPLOAD =  n.N + e.e + w.w + r.R + e.e + g.g + i.i + s.s + t.t + r.r + a.a + t.t + i.i + o.o + n.n + m.m+e.e+t.t+h.h+o.o+d.d+symbols.equal + u.U + p.p + l.l + o.o + a.a + d.d + g.g + a.a + t.t + e.e + u.u + n.n + l.l + o.o + c.c + k.k;

    public static final String SB_API_SAVE_LOCK_STATUS = m.m+e.e+t.t+h.h+o.o+d.d+symbols.equal + s.S + a.a + v.v + e.e + l.L+o.o+c.c+k.k + s.S + t.t + a.a + t.t + u.u + s.s;

    public static final String SB_API_ADD_NEW_LOCK =  m.m+e.e+t.t+h.h+o.o+d.d+symbols.equal + a.A + d.d + d.d + symbols.underscores + l.L+o.o+c.c+k.k + symbols.underscores + n.N + e.e + w.w;

    public static final String SB_API_CHECK_BLUETOOTH_ACCESS = c.C + o.o + n.n + s.S + e.e + r.r + v.v + i.i + c.c + e.e + symbols.dots+a.a+s.s+p.p+ x.x + symbols.question + m.m+e.e+t.t+h.h+o.o+d.d+symbols.equal + c.c + h.h + e.e + c.c + k.k + b.b + o.o + t.t + h.h + l.l + o.o + c.c + k.k + a.a + c.c + c.c + e.e + s.s + s.s;
    public static final String SB_API_GET_DEVICE_INFO = c.C + o.o + n.n + s.S + e.e + r.r + v.v + i.i + c.c + e.e + symbols.dots+a.a+s.s+p.p+ x.x + symbols.question + m.m+e.e+t.t+h.h+o.o+d.d+symbols.equal + c.c + h.h + e.e + c.c + k.k + b.b + o.o + t.t + h.h + l.l + o.o + c.c + k.k + a.a + c.c + c.c + e.e + s.s + s.s;

    public static final String SB_API_GET_GATE_RECORDS = m.m+e.e+t.t+h.h+o.o+d.d+symbols.equal + g.G + e.e + t.t + v.V + e.e + h.h + i.i + c.c + l.l + e.e + symbols.underscores + l.L+o.o+c.c+k.k + symbols.underscores + s.S + u.u + m.m + m.m + a.a + r.r + y.y;




}
