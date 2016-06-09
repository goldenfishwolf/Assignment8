單純的把兩個example合在一起

server部分，Main extends JFrame，這樣才有視窗，然後用JTextArea顯示字，
另外實作settext函數供其他class使用
原本範例的message是用system.out顯示，現在改用settext

Client部分，把Lab10的東西變成client的一部份，在算出答案候用sendmessage把答案送到server。