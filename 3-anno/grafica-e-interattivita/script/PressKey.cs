using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Extra : MonoBehaviour
{
    public GameObject cilindroSpawn;
    public Transform cilindroPos;
    void Update()
    {
        if (Input.GetKeyDown("g"))
        {
            Instantiate(cilindroSpawn, cilindroPos.position, cilindroPos.rotation);
        }
    }
}
