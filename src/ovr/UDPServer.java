package ovr;

import ovr.gui.Controller;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 13.12.13
 * Time: 21:41
 * To change this template use File | Settings | File Templates.
 */
public class UDPServer extends Thread {
    private int port = 9876;
    private boolean stop;
    private Controller controller;

    public void run(){
        DatagramSocket serverSocket = null;
        try {
            serverSocket = new DatagramSocket(port);

        byte[] receiveData = new byte[1024];
        byte[] sendData = new byte[1024];
//        int x = 0;
        double y = 0;
        double delta = 0.03;
        System.out.println("Server startet..");
        while (!stop) {
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            String sentence = new String(receivePacket.getData());
//            System.out.println("RECEIVED: " + sentence);
            InetAddress IPAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();

            String coordinaten = controller.getCoordinate().toString();
            sendData = coordinaten.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            serverSocket.send(sendPacket);
//            y= y + delta;
//            if(y > 5 || y < 0){
//                delta = -delta;
//            }
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
    public void abort(){
        stop = true;
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
