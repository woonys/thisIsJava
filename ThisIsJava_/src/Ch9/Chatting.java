//package Ch9;
//
//public class Chatting {
//    void startChat(String chatId) {
//        String nickName = null;
//        nickName = chatId;
//        Chat chat = new Chat() {
//            @Override
//            public void start() {
//                while (true) {
//                    String inputData = "안녕하세요";
//                    // nickName: 중첩 클래스 안에서 사용되니 final 특성을 갖는다. 근데 얘를 chatId로 정의했기 때문에 final 특성 갖는 nickName 보고 컴파일 에러 발생
//                    String message = "["+ nickName + "] " + inputData;
//                    sendMessage(message);
//                }
//            }
//        };
//        chat.start();
//    }
//    class Chat {
//        void start() {}
//        void sendMessage(String message) {}
//    }
//}
