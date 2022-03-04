package me.iamdoky;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Moja moja = new MagicMoja();          // 애노테이션 프로세서를 통하여 생성할 클래스
        System.out.println(moja.pullOut());
    }
}
