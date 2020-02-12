package com.example.exam;

//room class
public class Chambre {
  private  int idRoom;
  private  int etaj;
  private boolean vide;
  public Chambre()
  {
      this.idRoom = 0;
      this.etaj = 0;
      this.vide = false;
  }
  public Chambre(int idRoom, int etaj, boolean empty) {
      this.idRoom = idRoom;
      this.etaj = etaj;
      this.vide = empty;
  }
  public int getEtaj() {
      return etaj;
  }
  public void setEtaj(int etaj) {
      this.etaj = etaj;
  }
  public boolean estVide() {
      return vide;
  }
  public void setVide(boolean vide) {
      this.vide = vide;
  }
  public int getIdRoom() {
      return idRoom;
  }
  public void setIdRoom(int idRoom) {
      this.idRoom = idRoom;

      public void bookRoom(int roomNum)
{
        Object[] chambres;
        if (chambres[roomNum].estLibre() == false)
    {
        chambres[roomNum].estLibre(false);
    }
    else
        System.out.println("Chambre " + roomNum + " est toujours occupée.");
  }
}