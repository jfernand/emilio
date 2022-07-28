package es.casaroja.emilio.main

import org.koin.core.component.KoinComponent

interface EmailService
class EmailManager : KoinComponent, EmailService
