using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class GameOverPanel : MonoBehaviour
{
    public GameObject gameOverScritta;
    public GameObject inputNumeri;
    public GameObject fireButton;
    void Start()
    {
        gameOverScritta.SetActive(false);
        inputNumeri.SetActive(false);
        fireButton.SetActive(false);
    }
    void Update()
    {
        
        if (gameObject.GetComponent<Transform>().position.y < 7.75f)
        {
            gameOverScritta.SetActive(true);
        }
        if(gameObject.GetComponent<Transform>().position.y < 6.75f)
        {
            inputNumeri.SetActive(true);
            fireButton.SetActive(true);
        }
    }
}
