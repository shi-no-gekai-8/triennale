using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class MaxHighness : MonoBehaviour
{
    float altezza;
    public Text altezzaTesto;
    void Start()
    {
        altezza = gameObject.GetComponent<Rigidbody>().transform.position.y;
    }

    void Update()
    {
        if(gameObject.GetComponent<Rigidbody>().transform.position.y > altezza)
        {
            altezza = gameObject.GetComponent<Rigidbody>().transform.position.y;
            altezzaTesto.text = "Altezza Massima: " + altezza;
        }
    }
}
