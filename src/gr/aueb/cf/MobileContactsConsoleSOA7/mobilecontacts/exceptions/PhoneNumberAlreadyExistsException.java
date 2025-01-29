package gr.aueb.cf.MobileContactsConsoleSOA7.mobilecontacts.exceptions;

import java.io.Serial;

public class PhoneNumberAlreadyExistsException  extends  Exception{

    public PhoneNumberAlreadyExistsException(String message) {
        @Serial
        private static final long serialVersionUID = 1L;

        public PhoneNumberAlreadyExistsException (String message) {
            super(message);
        }
    }
}
