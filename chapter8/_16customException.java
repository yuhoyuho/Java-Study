package chapter8;

public class _16customException {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println("Error Message : " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
        } catch (MemoryException me) {
            System.out.println("Error Message : " + me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("다시 설치를 시도하세요.");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if(!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족합니다.");
        }
        if(!enoughMemory()) {
            throw new MemoryException("메모리가 부족합니다.");
        }
    }

    static void copyFiles() {/*파일들을 복사하는 코드 작성*/}
    static void deleteTempFiles() {/*임시파일들을 삭제하는 코드를 적는다*/}

    static boolean enoughSpace() {
        // 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
        return true;
    }

    static boolean enoughMemory() {
        // 설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다.
        return false;
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}// 310p ~