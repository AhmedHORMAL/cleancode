package zhangyi.refactoring.messagehandler.checker;/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */

import zhangyi.refactoring.messagehandler.MessageReader;

public class SO05MessageChecker extends MessageChecker {
    public SO05MessageChecker(MessageReader messageReader, String messageText) {
        super(messageReader, messageText);
    }

    @Override
    public void checkResponse() {

    }
}
