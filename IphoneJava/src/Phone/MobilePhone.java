package Phone;

import Phone.Functions.*;

public class MobilePhone implements CallManager, MusicPlayer, InternetBrowser {
    private String deviceName;
    private String deviceBrand;
    private String deviceOwner;
    
    public MobilePhone(String deviceName, String deviceBrand, String deviceOwner) {
        this.deviceName = deviceName;
        this.deviceBrand = deviceBrand;
        this.deviceOwner = deviceOwner;
    }

    public void deviceDesc(){
        System.out.println(this.deviceName + " - " + this.deviceBrand + " of: " + this.deviceOwner); 
    } 

    public void play(){
        System.out.print("Playing Music from: ");
        deviceDesc();
    }

    public void pause(){
        System.out.print("Pausing Music from: ");
        deviceDesc();
    }

    public void selectSong(){
        System.out.print("Selecting song from: ");
        deviceDesc();
    }

    public void showPage(){
        System.out.print("Showing page from: ");
        deviceDesc();
    }

    public void addNewTab(){
        System.out.print("Adding new page to: ");
        deviceDesc();
    }

    public void reloadTab(){
        System.out.print("Reloading tab from: ");
        deviceDesc();
    }

    public void call(){
        System.out.print("Calling from: ");
        deviceDesc();
    }

    public void answer(){
        System.out.print("Answering call from: ");
        deviceDesc();
    }

    public void initVoiceMail(){
        System.out.print("initializing voice mail from: ");
        deviceDesc();
    }
}

