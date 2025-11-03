using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class ExtraHandler : MonoBehaviour
{
    public GameObject gameOverScrittaDopo;
    public Button fireButton;
    public InputField numbers;
    public GameObject sferaSpawnata;    
    public Transform spawnPos;
    int numberReader;     
 

    public void onClicked()
    {
        System.Random random = new System.Random();
        int z = random.Next(20, 40);
        int x = random.Next(-13, 5);
        int y = random.Next(9, 10);
        numberReader = int.Parse(numbers.text);
        for(int i=0; i < numberReader; i++)
        {
            Instantiate(sferaSpawnata, spawnPos.position = new Vector3(x, y, z), spawnPos.rotation);
        }
    }

}
