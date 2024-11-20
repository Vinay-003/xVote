package com.example.votingapp

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment

class SelectCandidatePage(private val candidates: List<Candidate>) : BasePage() {
    override val title: String = "Select Candidate"

    @Composable
    fun Content(setCurrentPage: (BasePage) -> Unit) {
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(candidates) { candidate ->
                Button(onClick = { setCurrentPage(IdDetailsPage(candidate)) }) {
                    Text(candidate.name)
                }
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}