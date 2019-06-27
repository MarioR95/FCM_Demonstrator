name := """FCM_Demonstrator"""
organization := "it.corisa"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.8"

libraryDependencies += javaJdbc

libraryDependencies += guice


