using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class FallIce : MonoBehaviour
{
    public static int numeroCilindri = 0;
    public Text iceScritta;
    public GameObject ghiaccioCaduto;
    bool incremento;
    void Start()
    {
        iceScritta.text = "GHIACCIO CADUTO: " + numeroCilindri;
        incremento = true;
    }
    void Update()
    {
        if(ghiaccioCaduto.transform.position.x < -14f && incremento)
        {
            incremento = false;
            numeroCilindri++;
            iceScritta.text = "GHIACCIO CADUTO : " + numeroCilindri;
            ghiaccioCaduto.GetComponent<Renderer>().material.color = new Color(11f / 255f, 7f / 255f, 237f / 255f);
        }
    }
}
