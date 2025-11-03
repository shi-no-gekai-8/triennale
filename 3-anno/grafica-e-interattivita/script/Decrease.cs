using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class Contatore : MonoBehaviour
{
    public static int blocchi = 5;
    public Text numeroBlocchi;
    public GameObject blocchiDistrutti;
    bool decremento;
    void Start()
    {
        numeroBlocchi.text = "Blocchi in piedi: " + blocchi;
        decremento = true;
    }
    void Update()
    {
        if (blocchiDistrutti.transform.rotation.z < 0 && decremento)
        {
            decremento = false;
            blocchi--;
            numeroBlocchi.text = "Blocchi in piedi: " + blocchi;
            Destroy(blocchiDistrutti, 1);
        }
    }
}
