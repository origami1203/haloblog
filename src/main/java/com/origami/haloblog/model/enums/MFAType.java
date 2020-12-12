package com.origami.haloblog.model.enums;

/**
 * @author origami1203
 * @date 2020-12-11 14:00
 * @description TODO
 */
public enum MFAType {
    /**
     * Disable MFA auth.
     */
    NONE(0),

    /**
     * Time-based One-time Password (rfc6238).
     * see: https://tools.ietf.org/html/rfc6238
     */
    TFA_TOTP(1);

    MFAType(Integer value) {
    }

    public static boolean useMFA(MFAType mfaType) {
        return mfaType != null && MFAType.NONE != mfaType;
    }
}
